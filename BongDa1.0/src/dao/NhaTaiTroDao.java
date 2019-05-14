
package dao;

import java.util.*;
import entities.*;
import org.hibernate.*;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Anh Duy
 */
public class NhaTaiTroDao {

   public boolean add(Nhataitro ntt) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(ntt);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Nhataitro ntt) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(ntt);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Nhataitro ntt) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(ntt);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   
    public Nhataitro load(int id_ntt) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Nhataitro ntt=(Nhataitro) session.get(Nhataitro.class,id_ntt);
     transaction.commit();
     return ntt;
    }

 
    public List<Nhataitro> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Nhataitro";
        Query query=session.createQuery(hql);
        List<Nhataitro> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
}
