//package com.example.demo.DAO;
//
//import com.example.demo.Entity.Account;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//public interface AccountDAO extends CrudRepository<Account, Long> {
//    @Query("select u from Account u where u.username is :username and u.password is :password")
//    List<Account> findByNameAndPassword(@PathVariable("username") String userName, @PathVariable("password") String password);
//
////    @Query("select u from Account where u.username is :username and u.password is :password and u.status is :worker")
////    List<Account> findByNameAndPasswordAndStatus(@PathVariable("username") String userName, @PathVariable("password") String password);
//
//}
