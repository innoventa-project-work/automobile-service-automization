package DAO;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.CountryVO;
import VO.StateVO;
import VO.cityVO;

public class cityDAO {

	public static List searchCountry(CountryVO countryVO) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from CountryVO");
			ls=w.list();
			System.out.println("Country list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

	public void InsertCity(cityVO cv) {
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

	public List searchCity(cityVO cv) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from cityVO");
			ls=w.list();
			System.out.println("city list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
		
	
	}

	public List editCity(cityVO cv) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from cityVO where cid='"+cv.getCityId()+"'");
			
			ls=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

	public void updateCity(cityVO v) {
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			session.saveOrUpdate(v);
		
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
	}

	public List loadState(CountryVO countryVo) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from StateVO where cid='"+countryVo.getCid()+"'");
			
			ls=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}
}
