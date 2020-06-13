package com.ying.control;


import com.ying.mapper.DepartmentMapper;
import com.ying.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;
    @GetMapping("/test")
    public List<Department> getDepatrment(){
        return departmentMapper.getDepartment();
}
    @GetMapping("/test1/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){
        return departmentMapper.getDepartmentById(id);
}


}
