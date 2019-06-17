
package dao;
import java.util.*;
import entities.*;
import org.hibernate.*;

public class VongDAO {
       
  
    public boolean add(Vong tt) {
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


    public boolean update(Giaidau sinhVien) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(sinhVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean delete(Giaidau tt) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(tt);
        transacsion.commit();
        return true;
        } catch (Exception e) {
            return false;
        }
    }

   
    public Giaidau load(String id_Sinh_vien) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Giaidau sinhVien=(Giaidau) session.get(Giaidau.class,id_Sinh_vien);
     transaction.commit();
     return sinhVien;
    }

 
    public List<Vong> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Vong";
        Query query=session.createQuery(hql);
        List<Vong> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
    

}
