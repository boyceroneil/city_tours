package com.example.demo.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AccountIMPL implements CityDAO{
    private final EntityManager manager;

    @Autowired
    public AccountIMPL(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Object> searchAll() {
        Session session = manager.unwrap(Session.class);
        Query<Object> query = session.createQuery("from Account");
        return query.getResultList();    }

    @Override
    public Object searchId(int theId) {
        return null;
    }

    @Override
    public List<Object> search(Object object) {
        return null;
    }

    @Override
    public Object identify(Object name, Object password) {
        return null;
    }

    @Override
    public void saveUpdate(Object object) {
        Session current = manager.unwrap(Session.class);
        current.saveOrUpdate(object);
    }

    @Override
    public void deleteId(int theId) {

    }
}
