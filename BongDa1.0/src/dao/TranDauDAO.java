package dao;
import java.util.*;
import entities.*;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Vuong Nguyen
 */
public class TranDauDAO {
    public boolean add(Trandau td) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
             save(td);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Trandau td) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(td);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Trandau td) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(td);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   
    public Trandau load(int maTranDau) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Trandau ntt=(Trandau) session.get(Trandau.class,maTranDau);
     transaction.commit();
     return ntt;
    }

 
    public List<Trandau> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Trandau";
        Query query=session.createQuery(hql);
        List<Trandau> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    public List<Trandau> load_danhSach_DK(int ma) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Trandau where maTran="+ma;
        Query query=session.createQuery(hql);
        List<Trandau> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public boolean AddTranDau(Trandau tt) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(tt);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean UpdateTranDau(Trandau tt) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.update(tt);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean CheckExist(String usename) {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="Select nn.ID from nguoidung nn where nn.UseName ='"+usename+"'";
        Query query=session.createQuery(hql);
        List<Nguoidung> Nd=query.list();
        transacsion.commit();
        return Nd.size() <= 0;      
    }
}
    /*

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public boolean AddTranDau(Trandau tt) {
        //try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(tt);
            transacsion.commit();
            return  true;
        /*} catch (Exception e) {
            return false;
        }
    }
    public boolean UpdateTranDau(Trandau tt) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.update(tt);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean CheckExist(String usename) {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="Select nn.ID from nguoidung nn where nn.UseName ='"+usename+"'";
        Query query=session.createQuery(hql);
        List<Nguoidung> Nd=query.list();
        transacsion.commit();
        return Nd.size() <= 0;      
    }
}
*/