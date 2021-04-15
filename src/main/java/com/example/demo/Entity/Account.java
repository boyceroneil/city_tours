//package com.example.demo.Entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="account")
//public class Account {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name="id")
//    private int id;
//
//    @Column(name="username")
//    private String name;
//
//    @Column(name="password")
//    private String password;
//
//    @Column(name="status")
//    private String status;
//
//    public Account(int id, String name, String password, String status) {
//        this.id = id;
//        this.name = name;
//        this.password = password;
//        this.status = status;
//    }
//
//    public Account() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", status='" + status + '\'' +
//                '}';
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//}
