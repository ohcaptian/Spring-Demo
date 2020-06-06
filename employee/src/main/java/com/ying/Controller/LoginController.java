package com.ying.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {
    /*
    @RequestParam：将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
     */
    @RequestMapping("/user/login")
    public String Login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if("root".equals(username)&&password.equals("root")){
                    return "redirect:/main.html";
        }else {
            model.addAttribute("msg","你无法登入网站");
            return "index";
        }
    }
}
