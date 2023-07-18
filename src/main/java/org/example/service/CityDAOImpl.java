package org.example.service;

import org.example.HibernateSessionFactoryUtil;
import org.example.model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityDAOImpl implements CityDAO {


    public City addCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
        return city;
    }

    public City readCityByID(int id) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.get(City.class, id);
        }
    }

    public List<City> readAllCity() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM City").getResultList();
        }
    }

    public City updateCity(City city) {
        City updated;
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            updated = (City) session.merge(city);
            transaction.commit();
        }
        return updated;

    }

    public void deleteCity(City city) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
    }

}
