package dao;

import java.util.*;
import entities.*;
import org.hibernate.*;

public class XepHangDao {

   public boolean add(Xemhang xh) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(xh);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update(Xemhang  ntt) {
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


    public boolean delete(Xemhang ntt) {
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

   
    public Xemhang load(int id_ntt) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Xemhang ntt=(Xemhang) session.get(Xemhang.class,id_ntt);
     transaction.commit();
     return ntt;
    }

 
    public List<Xemhang> load_danhSach() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Xemhang";
        Query query=session.createQuery(hql);
        List<Xemhang> list_ntt=query.list();
        transacsion.commit();
        return list_ntt;        
    }
}
