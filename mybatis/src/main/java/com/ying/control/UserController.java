package com.ying.control;


import com.ying.pojo.User;
import com.ying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/add")
    public String add(){
        User user = new User();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("xd");
        int id = userService.add(user);
        return "success";
    }
    @GetMapping("/delete")
    public String delete(){
        int id=19;
        userService.deleteById(id);
        return "delete";
    }
    @GetMapping("findall")
    public List<User> select(){
        return  userService.findAll();
    }
    @GetMapping("findone")
    public User selectone(){
        int id =18;
        return userService.findById(18);
    }
    @GetMapping("update")
    public String update(){
            User user = new User();
            user.setName("aaa");
            user.setId(18);
            user.setCreateTime(new Date());
            user.setAge(23);
            userService.updateUser(user);
            return "success";
    }

}
