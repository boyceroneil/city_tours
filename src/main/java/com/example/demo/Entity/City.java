package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="picture")
    private String picture;

    @Column(name="description")
    private String description;

    @Column(name="fun_facts")
    private String fun_facts;

    @Column(name="location")
    private String location;

    @Column(name="flag")
    private String flag;

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFun_facts() {
        return fun_facts;
    }

    public void setFun_facts(String fun_facts) {
        this.fun_facts = fun_facts;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                ", fun_facts='" + fun_facts + '\'' +
                ", location='" + location + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
