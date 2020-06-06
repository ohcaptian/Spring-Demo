package com.ying.yaml.controler;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
/*
        在templates在的目录通过Controller跳转
 */

public class HelloControler {
   @RequestMapping("/index")
    public String test(Model model){
       model.addAttribute("msg","hello thymeleft");
       model.addAttribute("users","hello");
//       model.addAttribute("users","world");
//       model.addAttribute("users","！");
        return "index";
    }
}
