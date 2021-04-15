package com.example.demo.DAO;

import com.example.demo.Entity.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import java.util.List;

@Repository
public class CityIMPL implements CityDAO{
    private final EntityManager manager;

    @Autowired
    public CityIMPL(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Object> searchAll() {
        Session session = manager.unwrap((Session.class));
        Query<Object> query = session.createQuery("from City");
        return query.getResultList();
    }

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
    Session session = manager.unwrap(Session.class);
    session.saveOrUpdate(object);
    }

    @Override
    public void deleteId(int theId) {
    Session session = manager.unwrap((Session.class));
        City city = session.get(City.class, theId);
        session.delete(city);
    }
}
