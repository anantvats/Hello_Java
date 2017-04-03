package com.viz.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.viz.beans.UserBean;

public class UserDao {
	static Configuration cfg=new Configuration().configure();
	static SessionFactory sf=cfg.buildSessionFactory();

	public  static int saveUser(List <UserBean> users)
	{
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		for(UserBean usr:users)
		{
			session.persist(usr);
		}
		transaction.commit();
		session.close();
		return 1;
	}
	public static List<UserBean> showUsers()
	{
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="From UserBean";
		Query query=session.createQuery(hql);
		List<UserBean> userlist=query.list();
		return userlist;
		
	}

}
