package DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.loginVO;

public class loginDAO implements  Serializable {

	public static void addUser(loginVO loginVO) {
		// TODO Auto-generated method stub
		try
		 {
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction tr = session.beginTransaction();
			 session.save(loginVO);
			 tr.commit();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

	public List authentication(loginVO loginvo) {
		List ls = null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from loginVO where email='"+loginvo.getEmail()+"' and password='"+loginvo.getPassword()+"' ");
			
			ls=w.list();
			
			tr.commit();
			System.out.println(ls.size());
			System.out.println("Done");
			
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
		// TODO Auto-generated method stub
		
	}

}
