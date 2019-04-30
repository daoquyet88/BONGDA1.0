/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.*;
import entities.*;
import org.hibernate.*;

public class TrongTaiDAO {
    private final SessionFactory sf=HibernateUtil.getSessionFactory();
    public List<Trongtai> findAll()
    {
        try {
            sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(Trongtai.class).list();
        } catch (Exception e) {
            return null;
        }
    }
    // tim tai khoan dua tren usename
    public Trongtai find(String tenTrongTai)
    {
        try {
            sf.getCurrentSession().beginTransaction();
            return (Trongtai) sf.getCurrentSession().get(Trongtai.class,tenTrongTai);
        } catch (Exception e) {
            return null;
        }
    }
    public boolean delete(Trongtai tt)
    {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().delete(tt);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    public boolean saveorupdate(Trongtai tt)
    {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().saveOrUpdate(tt);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }

}
