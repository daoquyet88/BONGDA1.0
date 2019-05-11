/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import entities.*;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Vuong Nguyen
 */
public class DangKyDAO {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }public boolean AddNguoiDung(Nguoidung nn) {
        //try {          

            Session session=HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transacsion=session.beginTransaction();
            session.
            save(nn);
            transacsion.commit();
            return  true;
        /*} catch (Exception e) {
            return false;
        }*/
    }
    public static String mahoaMD5(String srcText) throws NoSuchAlgorithmException, UnsupportedEncodingException
     {
         String enrText ;
         MessageDigest msd = MessageDigest.getInstance("MD5");
         byte[] srcTextBytes = srcText.getBytes("UTF-8");
         byte[] enrTexyBytes = msd.digest(srcTextBytes);
         BigInteger bigInt = new BigInteger(1,enrTexyBytes);
         enrText = bigInt.toString(16);
         return  enrText;
     }
    public boolean CheckExist(String usename) {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacsion=session.beginTransaction();
        // lenh hql
        String hql="Select nn.ID from nguoidung nn where nn.UseName ='"+usename+"'";
        Query query=session.createQuery(hql);
        List<Nguoidung> Nd=query.list();
        transacsion.commit();
        return Nd.size() <= 0;      
    }
}
