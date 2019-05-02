
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
    public Trongtai find(String MaTrongTai)
    {
        try {
            sf.getCurrentSession().beginTransaction();
            return (Trongtai) sf.getCurrentSession().get(Trongtai.class,MaTrongTai);
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
    public boolean save(Trongtai tt)
    {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().save(tt);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    public boolean update(Trongtai tt)
    {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().update(tt);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }

}
