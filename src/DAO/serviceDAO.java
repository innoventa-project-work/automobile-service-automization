package DAO;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.VehicleCategoryVO;
import VO.serviceVO;

public class serviceDAO {

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

	public static void InsertService(serviceVO sv) {
		// TODO Auto-generated method stub
		try
		 {
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction tr = session.beginTransaction();
			 session.save(sv);
			 tr.commit();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }

		
	}

	public static List searchServices(serviceVO sv) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from serviceVO");
			ls=w.list();
			System.out.println("service list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

}
