package com.ying.yaml.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
 */
@Component
/*
        jsr 303校验
 */
@ConfigurationProperties(prefix = "person")
@Validated//数据校验
public class Person {
   @Max(value = 30,message = "年龄不能超过10岁")
    private Integer age;
    private String name;
    private boolean happy;
    private Date birth;
    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;

    public Person() {
    }

    public Person(Integer age, String name, boolean happy, Date birth, Map<String, Object> map, List<Object> list, Dog dog) {
        this.age = age;
        this.name = name;
        this.happy = happy;
        this.birth = birth;
        this.map = map;
        this.list = list;
        this.dog = dog;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", happy=" + happy +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
