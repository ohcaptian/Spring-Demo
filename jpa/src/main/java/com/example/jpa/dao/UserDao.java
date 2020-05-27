
package com.example.jpa.dao;
import com.example.jpa.dao.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Fruit, Long> {

}
