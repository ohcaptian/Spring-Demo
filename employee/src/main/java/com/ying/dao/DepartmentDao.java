package com.ying.dao;

import com.ying.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;
    //模拟数据库数据
    static {
        departments = new HashMap<>();
        departments.put(1,new Department(1,"市场部"));
        departments.put(2,new Department(2,"运营部"));
        departments.put(3,new Department(3,"后勤部"));
        departments.put(4,new Department(4,"教研部"));
    }
    //
    public Collection<Department> getDepartments(){
        return departments.values();
    }
    //获取部门通过部门id
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }

}
