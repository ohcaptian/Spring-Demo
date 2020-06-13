package com.ying.mapper;


import com.ying.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
/*
声明这个为mybatis的dao接口，spring扫描到它之后，会自动生成对应的代理
 */
@Repository
public interface DepartmentMapper {
            //获取部门
            List<Department> getDepartment();
            //通过id获取部门
            Department getDepartmentById(Integer id);
}
