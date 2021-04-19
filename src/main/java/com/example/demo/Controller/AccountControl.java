package com.example.demo.Controller;

import com.example.demo.DAO.AccountCRUD;
import com.example.demo.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ={"http://localhost:3000"})
@RestController
public class AccountControl {

    //private final AccountCRUD crud;

//    @Autowired
//    public AccountControl(@Qualifier("accountIMPL") AccountCRUD crud) {
//        this.crud = crud;
//    }
    @Autowired
     AccountCRUD accountCrud;
    @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account s){
        accountCrud.save(s);
        return s;
    }
    @GetMapping("/getUsername/{username}")
    public List<Account> getUsername(@PathVariable("username")String username){
        return accountCrud.findByName(username);
    }
    @GetMapping("/getAccount/{username}/{password}")
    public boolean getAccount(@PathVariable("username") String username, @PathVariable("password") String password){
        if(accountCrud.findByUsername(username, password)){
            return true;
        }
        else return false;
    }
    @GetMapping("/getAccountStatus/{username}/{password}")
    public boolean getStatus(@PathVariable("username") String username, @PathVariable("password") String password){
        if(accountCrud.findByStatus(username, password)){
            return true;
        }
        else return false;
    }

}
