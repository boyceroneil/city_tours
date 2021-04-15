//package com.example.demo.Controller;
//
//import com.example.demo.Entity.Account;
//import com.example.demo.DAO.AccountDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
////public class AccountController {
////    AccountDAO dao;
////
////    @PostMapping("/createAccount")
////    public Account createAccount(@RequestBody Account account){
////        dao.save(account);
////        return account;
////
////    }
////
////    @GetMapping("/GetAccount/{username}/{password}")
////    public List<Account> getAccount(@PathVariable("username") String username, @PathVariable("password") String password){
////        return dao.findByNameAndPassword(username,password);
////    }
////
//////    @GetMapping("/GetAccountStatus/{username}/{password}")//i need to fix this to find username,password, that equal regular person
//////    public List<Account> getAccountStatus(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("status") String status){
//////        return accountDAO.findByNameAndPasswordAndStatus(username, password);
//////    }
////}
