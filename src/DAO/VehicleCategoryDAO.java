package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.VehicleCategoryVO;

public class VehicleCategoryDAO {
	public void InsertCategory(VehicleCategoryVO v)
	{
		try
		 {
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction tr = session.beginTransaction();
			 session.save(v);
			 tr.commit();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

	public List SeearchVehCategory(VehicleCategoryVO vc) {
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

	public static List editCategory(VehicleCategoryVO vehicleCategoryVO) {
		// TODO Auto-generated method stub
		List l=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from VehicleCategoryVO where vcid='"+vehicleCategoryVO.getVcid()+"'");
			
			l=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return l;
	}

	public static void updateCategory(VehicleCategoryVO vehicleCategoryVO) {
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			session.saveOrUpdate(vehicleCategoryVO);
				
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		
	}
}
