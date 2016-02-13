package DAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

import VO.AmcVO;
public class AmcDAO 
{
 
 public void InsertAmc(AmcVO v)
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
 
 public List searchAmc(AmcVO v)
 {
	List ls = null;
	try
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		Query w=session.createQuery("from AmcVO");
		ls=w.list();
		System.out.println("Amc list size ::"+ls);
	}
	catch(Exception z)
	{
		z.printStackTrace();
	}
	return ls;
 }
}
