
package dao;
import entities.*;
import java.util.List;
import org.hibernate.*;
public class DoiBongDao {

    public boolean add(Doibong db) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(db);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Doibong db) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(db);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean delete(Doibong db) {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(db);
        transacsion.commit();
        return true;
        } catch (Exception e) {
            return false;
        }
    }

   
    public Doibong load(int maDoiBong) 
    {
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Doibong db=(Doibong)session.get(Doibong.class,maDoiBong);
        transaction.commit();
        return db;
    }

    // tim kiem boi ma cau thu
    public List<Doibong> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Doibong";
        Query query=session.createQuery(hql);
        List<Doibong> list_db=query.list();
        transacsion.commit();
        return list_db;        
    }
   
 // menh de where
    public List<Doibong> load_danhSachDK(String hql) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
       // String hql="from Cauthu";
        Query query=session.createQuery(hql);
        List<Doibong> list_TT=query.list();
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
