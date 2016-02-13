package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.VehicleCategoryVO;
import VO.companyVO;

public class companyDAO {

	public static List searchCategory(VehicleCategoryVO vc) {
		
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from VehicleCategoryVO");
			ls=w.list();
			System.out.println("category list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

	public static void InsertService(companyVO cv) {
		// TODO Auto-generated method stub
		try
		 {
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction tr = session.beginTransaction();
			 session.save(cv);
			 tr.commit();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }

	}

	public static List searchCompany(companyVO cv) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from companyVO");
			ls=w.list();
			System.out.println("company list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
		
	}

	public static List editCompany(companyVO companyVO) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from companyVO where comid='"+companyVO.getComid()+"'");
			
			ls=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

	public static void updateCompany(companyVO companyVO) {
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			session.saveOrUpdate(companyVO);
		
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
	}

}
