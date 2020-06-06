package com.ying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//员工表
@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Department departMent;
    private Integer gender;
    private Date birth;

    public Employee(Integer id, String name, String email, Department departMent, Integer gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departMent = departMent;
        this.gender = gender;
        //默认创建日期
        this.birth = new Date();
    }
}
