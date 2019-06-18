
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

   
    public Cauthu load(int ct) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Cauthu cauThu=(Cauthu) session.get(Cauthu.class,ct);
        transaction.commit();
        return cauThu;
    }

    // tim kiem boi ma cau thu
    public List<Cauthu> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Cauthu order by banThang DESC";
        Query query=session.createQuery(hql);
        List<Cauthu> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
   
 // menh de where
    public List<Cauthu> load_danhSachDK(String tenDoiBong) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Cauthu where maDoibong='"+tenDoiBong+"'";
        Query query=session.createQuery(hql);
        List<Cauthu> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
    public List<Cauthu> load_danhSachDK_db(int maDoiBong) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Cauthu where maDoibong="+maDoiBong;
        Query query=session.createQuery(hql);
        List<Cauthu> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
     public List<Cauthu> load_danhSach_TimKiem(String tenCauThu) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Cauthu where tenCauThu like '%"+tenCauThu+"%'";
        Query query=session.createQuery(hql);
        List<Cauthu> list_TT=query.list();
        transacsion.commit();
        return list_TT;        
    }
//    public boolean updateDK(String hql,int soBanThang) 
//    {
//        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction transacsion=session.beginTransaction();
//        try{
//        // lenh hql
//       // String hql="from Cauthu";
//        Query query=session.createQuery(hql);
//        query.setParameter("banThang",soBanThang);
//        int result= query.executeUpdate();
//        transacsion.commit();
//        return true;    
//        }
//        catch(Exception e){
//            return false;
//        }
//    }
}
