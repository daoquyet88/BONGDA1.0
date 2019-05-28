
package dao;
import java.util.*;
import entities.*;
import org.hibernate.*;

public class CauThuDAO {
       
  
    public boolean add(Cauthu ct) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(ct);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Cauthu ct) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(ct);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean delete(Cauthu ct) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(ct);
        transacsion.commit();
        return true;
        } catch (Exception e) {
            return false;
        }
    }

   
    public Cauthu load(String ct) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Cauthu cauThu=(Cauthu) session.get(Trongtai.class,ct);
     transaction.commit();
     return cauThu;
    }

    // tim kiem boi ma cau thu
    public List<Cauthu> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Cauthu";
        Query query=session.createQuery(hql);
        List<Cauthu> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
    // menh de where
    public List<Cauthu> load_danhSachDK(String hql) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
       // String hql="from Cauthu";
        Query query=session.createQuery(hql);
        List<Cauthu> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
    public boolean updateDK(String hql,int soBanThang) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        try{
        // lenh hql
       // String hql="from Cauthu";
        Query query=session.createQuery(hql);
        query.setParameter("banThang",soBanThang);
        int result= query.executeUpdate();
        transacsion.commit();
        return true;    
        }
        catch(Exception e){
            return false;
        }
    }
    

}
