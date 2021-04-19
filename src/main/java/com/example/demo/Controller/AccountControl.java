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
    private AccountCRUD accountCrud;
    @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account s){
        accountCrud.save(s);
        //        cityDAO.saveUpdate(s);
        return s;
    }
    @GetMapping("/getAccount/{username}")
    public List<Account> getUsername(@PathVariable("username")String username){
        return accountCrud.findByName(username);
    }
    @GetMapping("/getAccount/{username}/{password}")
    public boolean getAccount(@PathVariable("username") String username, @PathVariable("password") String password){
        return accountCrud.findByUsername(username,password);
    }
    @GetMapping("/getAccountStatus/{username}/{password}")
    public boolean getStatus(@PathVariable("username") String username, @PathVariable("password") String password){
        return accountCrud.findByStatus(username,password);
    }

}
