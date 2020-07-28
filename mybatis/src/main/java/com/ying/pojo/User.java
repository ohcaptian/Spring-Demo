package com.ying.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;


import java.util.Date;

@Data
@NoArgsConstructor
@Component
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Date createTime;
}
