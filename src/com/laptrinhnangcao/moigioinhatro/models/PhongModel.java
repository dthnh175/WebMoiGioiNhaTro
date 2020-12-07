package com.laptrinhnangcao.moigioinhatro.models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.laptrinhnangcao.moigioinhatro.entities.Phong;

public class PhongModel {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Phong> findAll() {
		List<Phong> phongs = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			org.hibernate.query.Query query = session.createQuery("from Phong");
			phongs = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			phongs = null;
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return phongs;
	}
}
