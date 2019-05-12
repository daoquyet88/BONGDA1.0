/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

   public boolean add_LTD(Loaibanthang lbt) {
        try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(lbt);
            transacsion.commit();
            return  true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean update_lbt(Loaibanthang lbt) {
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


    public boolean delete_lbt(Loaibanthang lbt) {
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

   
    public Loaibanthang load_lbt(String id_Sinh_vien) 
    {
     Session session=HibernateUtil.getSessionFactory().getCurrentSession();
     Transaction transaction=session.beginTransaction();
     Loaibanthang sinhVien=(Loaibanthang) session.get(Loaibanthang.class,id_Sinh_vien);
     transaction.commit();
     return sinhVien;
    }

 
    public List<Loaibanthang> load_danhSachlbt() 
    {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="from Loaibanthang";
        Query query=session.createQuery(hql);
        List<Loaibanthang> list_lbt=query.list();
        transacsion.commit();
        return list_lbt;        
    }
}
