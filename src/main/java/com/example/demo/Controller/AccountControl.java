package com.example.demo.Controller;

import com.example.demo.DAO.CityDAO;
import com.example.demo.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ={"http://localhost:3000"})
@RestController
public class AccountControl {
    private final CityDAO cityDAO;

    @Autowired
    public AccountControl(@Qualifier("accountIMPL") CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }
    @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account s){
        cityDAO.saveUpdate(s);
        return s;
    }
}
