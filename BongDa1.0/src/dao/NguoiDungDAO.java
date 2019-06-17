package dao;
import entities.*;
import java.util.List;
import org.hibernate.*;

public class NguoiDungDAO{

   public boolean add(Nguoidung nd) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(nd);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Nguoidung nd) {
        try {           
        
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction =session.beginTransaction();
            session.update(nd);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }


    public boolean delete(Nguoidung nd)
    {
        try {
   
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        session.delete(nd);
        transacsion.commit();
        return true;
        } catch (HibernateException e) {
            return false;
        }
    }

   
    public Nguoidung load_ND(String maNguoiDung ) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Nguoidung nd=(Nguoidung) session.get(Nguoidung.class,maNguoiDung);
     transaction.commit();
     return nd;
    }

 
    public List<Nguoidung> load_danhSachND(String useName,String passWord) 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="From  Nguoidung WHERE useName='"+useName+"' AND passWord='"+passWord+"'";
        Query query=session.createQuery(hql);
        List<Nguoidung> list_nd=query.list();
        transacsion.commit();
        return list_nd;        
    }
    public boolean deleteAll() 
    {
        try{
            Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="DELETE FROM Nguoidung";
        Query query=session.createQuery(hql);
        query.executeUpdate();
        transacsion.commit();
        return true;   
        }
        catch (HibernateException e){
            return false;
        }
    }
}
