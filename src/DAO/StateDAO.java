package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.CountryVO;
import VO.StateVO;

public class StateDAO {

	public List searchCountry(CountryVO countryVO) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from CountryVO");
			ls=w.list();
			System.out.println("country list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

	public void InsertState(StateVO v) {
		// TODO Auto-generated method stub
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

	public List searchState(StateVO sv) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from StateVO");
			ls=w.list();
			System.out.println("state list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
		
	}

	public List editState(StateVO sv) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from StateVO where stateId='"+sv.getStateId()+"'");
			
			ls=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}

	public void updateState(StateVO sv) {
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			session.saveOrUpdate(sv);
			
		
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
	}

}
