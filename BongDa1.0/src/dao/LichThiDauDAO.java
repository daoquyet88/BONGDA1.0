
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
public class LichThiDauDAO {

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


    public boolean update(Trandau lbt) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(lbt);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Trandau lbt) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(lbt);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   
    public Trandau load(int id_Sinh_vien) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Trandau sinhVien=(Trandau) session.get(Trandau.class,id_Sinh_vien);
     transaction.commit();
     return sinhVien;
    }

 
    public List<Trandau> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from tranDau";
        Query query=session.createQuery(hql);
        List<Trandau> list_lbt=query.list();
        transacsion.commit();
        return list_lbt;        
    }
}
