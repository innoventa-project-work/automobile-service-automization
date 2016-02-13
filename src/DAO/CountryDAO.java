package DAO;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.CountryVO;

public class CountryDAO 
{
 public void InsertCountry(CountryVO v)
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

 public static List editcountry(CountryVO cv) {
		// TODO Auto-generated method stub
		List l=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from CountryVO where cid='"+cv.getCid()+"'");
			
			l=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return l;
	}
 
public List SearchCountry(CountryVO v1) {
	// TODO Auto-generated method stub
	List l = null;
	try
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session =sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Query w=session.createQuery("from CountryVO");
		
		l=w.list();
		
		tr.commit();
	}
	catch(Exception z)
	{
		z.printStackTrace();
	}
	return l;
}

public void updateCountry(CountryVO cv) {
	// TODO Auto-generated method stub
	try
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tr=session.beginTransaction();
		
		session.saveOrUpdate(cv);
			
		tr.commit();
	}
	catch(Exception z)
	{
		z.printStackTrace();
	}
	
}

}