package DAO;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.loginVO;
import VO.registrationVO;

public class registrationDAO implements Serializable{

	public static void addUser(registrationVO regVO) {
		// TODO Auto-generated method stub
		try
		 {
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction tr = session.beginTransaction();
			 session.save(regVO);
			 tr.commit();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

	public List loadEmail(loginVO loginVO) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from loginVO where email='"+loginVO.getEmail()+"'");
			
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
