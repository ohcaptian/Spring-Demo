
package com.example.jpa.dao;
import com.example.jpa.dao.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
    des Repositor 提供了数据库的相关操作;
 */
@Repository
public interface UserDao extends JpaRepository<Fruit, Long> {

}
