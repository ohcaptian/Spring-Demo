package com.ying.Controller;


import com.ying.dao.DepartmentDao;
import com.ying.dao.EmployeeDao;
import com.ying.pojo.Department;
import com.ying.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.Collection;

@Controller
public class EmployeeController {


    @Autowired
    public EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees=employeeDao.all();
            model.addAttribute("emps",employees);
            return "list";
    }

    @GetMapping("/emp")
    public String addEmp(Model model){
       Collection<Department> departments= departmentDao.getDepartments();
       model.addAttribute("dept",departments);
        return "add";
    }
    @PostMapping("/emp")
    public String add(Employee employee){
        employeeDao.addEmployee(employee);
        return "redirect:/emps";
    }
    //等待完成
    /*@GetMapping("/emp/{id}")
    public String updata(@PathVariable Integer id){


            return "update";
    }  */
    @GetMapping("/delemp/{id}")
    public String delete(@PathVariable("id") Integer id){
        employeeDao.delectEmployeeById(id);
        return "redirect:/emps";
    }
}
