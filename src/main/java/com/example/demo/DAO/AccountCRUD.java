package com.example.demo.DAO;

import com.example.demo.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AccountCRUD extends CrudRepository<Account, Long> {
//    Object saveUpdate(Object s);

    @Query("select u from Account u where u.username is :username")
    List<Account> findByName(@PathVariable("username") String username);

    @Query("select u from Account u where u.username is :username and u.password is :password")
    boolean findByUsername(@PathVariable("username") String username, @PathVariable("password") String password);

    @Query("select u from Account u where u.username is :username and u.password is :password and u.status is :worker")
    boolean findByStatus(@PathVariable("username") String username, @PathVariable("password") String password);
}
