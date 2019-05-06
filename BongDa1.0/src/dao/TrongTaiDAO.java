
package dao;
import java.util.*;
import entities.*;
import org.hibernate.*;

public class TrongTaiDAO {
       
  
    public boolean add_TT(Trongtai tt) {
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


    public boolean update_TT(Trongtai sinhVien) {
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


    public boolean delete_TT(Trongtai tt) {
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

   
    public Trongtai load_TT(String id_Sinh_vien) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Trongtai sinhVien=(Trongtai) session.get(Trongtai.class,id_Sinh_vien);
     transaction.commit();
     return sinhVien;
    }

 
    public List<Trongtai> load_danhSachTT() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Trongtai";
        Query query=session.createQuery(hql);
        List<Trongtai> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
    

}
