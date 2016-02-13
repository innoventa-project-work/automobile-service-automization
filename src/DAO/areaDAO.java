package DAO;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.StateVO;
import VO.cityVO;
import VO.areaVO;
public class areaDAO {

	public void insertArea(areaVO av)
	{
		try
		 {
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 Session session = sessionFactory.openSession();
			 Transaction tr = session.beginTransaction();
			 session.save(av);
			 tr.commit();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
	public static List SearchArea(cityVO cityVO) {
		// TODO Auto-generated method stub
		List ls = null;
		
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from cityVO");
			ls=w.list();
			System.out.println("City list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
		
	}

	public List SearchArea(areaVO av) {
		// TODO Auto-generated method stub
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query w=session.createQuery("from areaVO");
			ls=w.list();
			System.out.println("area list size ::"+ls);
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}
	public List editArea(areaVO av) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from areaVO where areaID='"+av.getAreaID()+"'");
			
			ls=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}
	public List loadCity(StateVO stateVo) {
		// TODO Auto-generated method stub
		List ls=null;
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			Query w=session.createQuery("from cityVO where sid='"+stateVo.getStateId()+"'");
			
			ls=w.list();
			
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
		return ls;
	}
	public void updateArea(areaVO areaVO) {
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction tr=session.beginTransaction();
			
			session.saveOrUpdate(areaVO);
		
			tr.commit();
		}
		catch(Exception z)
		{
			z.printStackTrace();
		}
	}
}
