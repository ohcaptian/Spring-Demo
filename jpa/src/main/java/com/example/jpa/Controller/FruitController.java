package com.example.jpa.Controller;


import com.example.jpa.dao.Fruit;
import com.example.jpa.services.DemoServices;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
        跨域请求
 */
@CrossOrigin
@RestController
public class FruitController {
    @Resource
    private DemoServices demoServices;
    /*
          des test;
     */
    @GetMapping("/test")
    public String save(){
        Fruit fruit1 = new Fruit(1,10,"apple","red");
        Fruit fruit2 = new Fruit(2,5,"banana","yellow");
        Fruit fruit3 = new Fruit(3,12,"strawberry","red");
        Fruit fruit4 = new Fruit(4,22,"lemon","yellow");
        Fruit fruit5 = new Fruit(5,33,"pineapple","yellow");
        demoServices.addFruit(fruit1);
        demoServices.addFruit(fruit2);
        demoServices.addFruit(fruit3);
        demoServices.addFruit(fruit4);
        demoServices.addFruit(fruit5);
        return "ok.Demo2Controller.save";
    }
    /*
    des 查找数据表;
     */
    @GetMapping("/findall")
    public List<Fruit> findall(){
        return demoServices.findall();
    }
//    @GetMapping("find")
//    public String show(Model model){
//        model.addAttribute("info",demoServices.findall());
//        return "blank";
//    }
//    @GetMapping("/delete")

}
