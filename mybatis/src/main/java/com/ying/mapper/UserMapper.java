package com.ying.mapper;


import com.ying.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/*
    访问数据库的接口
 */
@Component
public interface UserMapper {

    //建议使用#{}取值
        @Insert("INSERT INTO user(name,create_time,age) VALUES(#{name},#{createTime},#{age})")
        @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")//keyProperty对象字段,keyColumn数据库字段
        int insert(User user);

        @Select("SELECT * FROM user")
        @Results({
             @Result(column = "create_time",property = "createTime")//
        })
        List<User> getAll();
        @Select("select * from user where id = #{id}")
        /**
         * @Description Results({Result 数据库字段与类名字段不一致时进行映射})
         * @Date 20:02 2020/7/28
         */
        @Results({
                @Result(column = "create_time",property = "createTime")//
        })
        User findById(Integer id);
        @Update("update user set name=#{name} where id=#{id}")
        void update(User user);
        @Delete("delete from user where id = #{id}")
        void delete(Integer id);

}
