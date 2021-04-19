package com.example.demo.Controller;

import com.example.demo.DAO.CityDAO;
import com.example.demo.Entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"http://localhost:3000"})
@RestController
public class CityController {
    private final CityDAO cityDAO;

    @Autowired
    public CityController(@Qualifier("cityIMPL") CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    @GetMapping("/GetCities")
    public List<Object> getCities(){
        return cityDAO.searchAll();
    }

    @PostMapping("/SaveCity")
    public City saveCity(@RequestBody City city){
        city.setId(0);
        cityDAO.saveUpdate(city);
        return city;
    }

    @PutMapping("/UpdateCity")
    public City updateCity(@RequestBody City city){
        cityDAO.saveUpdate(city);
        return city;
    }

    @DeleteMapping("/DeleteCity/{id}")
    public String deleteCity(@PathVariable int id){
        cityDAO.deleteId(id);
        return "deleted " +id;
    }

}
