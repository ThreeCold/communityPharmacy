package site.lovefan.communityPharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import site.lovefan.communityPharmacy.annotation.Auth;
import site.lovefan.communityPharmacy.pojo.Account;
import site.lovefan.communityPharmacy.service.UserService;
import site.lovefan.communityPharmacy.utils.CommonUtils;
import site.lovefan.communityPharmacy.utils.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by girlF on 2017/10/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("user/login");
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody  Result loginSubmit(String email, String password, String imageCode) {
        if (email == null || password == null || imageCode == null) {
            return Result.newErrorResult("邮箱或密码或图片验证码为空");
        }
        if (!CommonUtils.isEmail(email)) {
            return Result.newErrorResult("邮箱格式错误");
        }
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String imageCodeInSession = (String) session.getAttribute("imageCode");
        if (!imageCode.equalsIgnoreCase(imageCodeInSession)) {
            return Result.newErrorResult("图片验证码错误");
        }
        if (!userService.login(email, password)) {
            return Result.newErrorResult("邮箱或密码错误");
        } else {
            Account account = userService.selectByEmail(email).get(0);
            session.setAttribute("user", account);
            return Result.newSuccessResult("登录成功");
        }
    }

    @RequestMapping("/index")
    @Auth
    public ModelAndView index() {
        return new ModelAndView("user/index");
    }

    @RequestMapping("/welcome")
    @Auth
    public ModelAndView welcome() {
        return new ModelAndView("user/welcome");
    }


}
