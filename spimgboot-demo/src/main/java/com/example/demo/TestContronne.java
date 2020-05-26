package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController//返回解释为josn对象;
public class TestContronne {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/index")
    /*
    @RequestParam：将请求参数绑定到你控制器的方法参数上
    @RequestParam(value=”参数名”,required=”true/false”,defaultValue=””)
    value：参数名
    required：是否包含该参数，默认为true，表示该请求路径中必须包含该参数，如果不包含就报错。
    defaultValue：默认参数值，如果设置了该值，required=true将失效，自动为false,如果没有传该参数，就使用默认值
     */
       public Fruit fruit(@RequestParam(value = "name", defaultValue = "World")String name){
        return new Fruit(counter.incrementAndGet(), String.format(template, name));
    }



//   public Map<String,String> index(){
//                Map<String,String> map = new HashMap<>();
//                map.put("name","小明");
//                map.put("age","16");
//                return map;
//    }

}
