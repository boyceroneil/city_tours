//package com.example.demo.DAO;
//
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//
//@Repository
//public class AccountIMPL implements AccountCRUD{
//    private final EntityManager manager;
//
//    @Autowired
//    public AccountIMPL(EntityManager manager) {
//        this.manager = manager;
//    }
//
//
//    @Override
//    public Object saveUpdate(Object s) {
//        Session session = manager.unwrap((Session.class));
//        session.saveOrUpdate(s);
//        return s;
//    }
//
//    @Override
//    public boolean findByUsername(String username, String password) {
//        Session session = manager.unwrap(Session.class);
//        Query<Object> query = session.createQuery("from Account");
//        return false;
//    }
//
//    @Override
//    public boolean findByStatus(String username, String password) {
//        return false;
//    }
//}
