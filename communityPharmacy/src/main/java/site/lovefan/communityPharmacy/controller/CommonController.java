package site.lovefan.communityPharmacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import site.lovefan.communityPharmacy.utils.VerifyCodeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by girlF on 2017/10/22.
 */
@Controller
public class CommonController {

    @RequestMapping("/imageCode")
    public void getImageCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String imageCode = VerifyCodeUtils.generateVerifyCode(4);
        session.setAttribute("imageCode", imageCode);
        VerifyCodeUtils.outputImage(80,35, response.getOutputStream(), imageCode);
    }
}
