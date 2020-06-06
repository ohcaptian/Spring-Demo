package com.ying.dao;

import com.ying.pojo.Department;
import com.ying.pojo.Employee;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class EmployeeDao {

    /*
    自动装配,免去get，set方法
     */
    @Autowired
    private DepartmentDao departmentDao;
    private static Map<Integer, Employee> employees = null;
    static {
        employees = new HashMap<>();
        employees.put(101,new Employee(101,"Bob","183@qq.com",new Department(1,"市场部"),1));
        employees.put(102,new Employee(102,"Aci","199@qq.com",new Department(2,"运营部"),0));
        employees.put(103,new Employee(103,"Dvr","127@qq.com",new Department(3,"后勤部"),0));
        employees.put(104,new Employee(104,"Fir","156@qq.com",new Department(4,"教研部"),1));
    }
    //模拟自增
    //add employee
    public static Integer id = 105;
    public void addEmployee(Employee employee){
            if(employee.getId()==null){
                employee.setId(id++);
            }

        employee.setDepartMent(departmentDao.getDepartmentById(employee.getDepartMent().getId()));
            employees.put(employee.getId(),employee);
    }

    public Collection<Employee> all(){
        return employees.values();
    }

        public Employee getEmployeeById(Integer id){
                return  employees.get(id);
        }
        public void delectEmployeeById(Integer id){
                employees.remove(id);

        }

}
