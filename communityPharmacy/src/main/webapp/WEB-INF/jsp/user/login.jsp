<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<% String path = request.getContextPath();%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=path%>/lib/html5.js"></script>
    <script type="text/javascript" src="<%=path%>/lib/respond.min.js"></script>
    <script type="text/javascript" src="<%=path%>/lib/PIE_IE678.js"></script>
    <![endif]-->
    <link href="<%=path%>/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>社区药房管理系统后台登录</title>
    <script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path %>/lib/validation/jquery.validate.js"></script>
    <script type="text/javascript" src="<%=path %>/lib/validation/additional-methods.min.js"></script>
    <script type="text/javascript" src="<%=path %>/lib/validation/localization/messages_zh.min.js"></script>
    <script type="text/javascript" src="<%=path %>/lib/layer/1.9.3/layer.js"></script>
    <script type = "text/javascript">
        $(function() {
            $("#image").click(function() {
                $(this).attr("src","<%=path%>/imageCode?time="+Math.random());
            });
            $("#kanbuq").click(function() {
                $("#image").attr("src","<%=path%>/imageCode?time="+Math.random());
            });

            $("form").validate({
                rules:{
                    'email':{
                        required:true,
                        email:true
                    },
                    'password':{
                        required:true
                    },
                    'imageCode':{
                        required:true
                    }
                },
                messages:{
                    'email':{
                        required:"邮箱不能为空",
                        email:"请输入正确的邮箱"
                    },
                    'password':{
                        required:"密码不能为空"
                    },
                    'imageCode':{
                        required:"图片验证码不能为空"
                    }
                },
                submitHandler:function(form){
                    $.post(form.action,$(form).serialize(),function(result){
                        if(result.status=="success"){
                            location.href="<%=path%>/user/index";
                        }else{
                            $("#image").click();
                            layer.msg(result.message, {
                                time: 2500, //2s后自动关闭
                                btn: ['关闭'],
                                area: ['400px', '200px']
                            });
                        }
                    },"json");
                }
            });
        });

    </script>

</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" action="<%=path%>/user/login" method="post">
            <div class="row cl">
                <label class="form-label col-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-8">
                    <input id="email" name="email" type="text" placeholder="邮箱" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-8">
                    <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-8 col-offset-3">
                    <input name="imageCode" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
                    <img id="image" src="<%=path%>/imageCode"> <a id="kanbuq" href="javascript:;">看不清，换一张</a> </div>
            </div>
            <div class="row">
                <div class="formControls col-8 col-offset-3">
                    <label for="online">
                        <input type="checkbox" name="online" id="online" value="">
                        使我保持登录状态</label>
                </div>
            </div>
            <div class="row">
                <div class="formControls col-8 col-offset-3">
                    <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="footer">Copyright 童利航</div>
<script type="text/javascript" src="<%=path%>/js/H-ui.js"></script>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
    var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
    document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F080836300300be57b7f34f4b3e97d911' type='text/javascript'%3E%3C/script%3E"));
</script>
</body>
</html>
