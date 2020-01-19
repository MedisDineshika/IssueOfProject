package com.pharmacy.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pharmacy.model.Disease;
import com.pharmacy.model.Item;

import com.pharmacy.model.Reg;


@Repository
public class ItemDaoImpl implements ItemDao{

	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Item item) {

		sessionFactory.getCurrentSession().save(item);
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Item> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Item> result= null;
		try {
			Query query = session.createQuery("from Item");
			
			
			
			 result = query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item>findByEXDBefore(Date EXD) {

		Session session = sessionFactory.getCurrentSession();
		List<Item> result= null;
		try {
			Query query = session.createQuery("from Item as i where  i.EXD < (CURDATE()+9)");
			
			//Query query = session.createQuery("from Item as i where  i.EXD > (CURDATE()+9)");
			
			//Query query = session.createQuery("from Item as i where  i.EXD >=CURDATE()");
			
			 result = query.list();
			
	        } catch (Exception e) {
			e.printStackTrace();
	        }
		return result;
			    	

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item>findByEXDMoreBefore(Date EXD) {

		Session session = sessionFactory.getCurrentSession();
		List<Item> result= null;
		try {
			Query query = session.createQuery("from Item as i where  i.EXD > (CURDATE()+9)");
			
			//Query query = session.createQuery("from Item as i where  i.EXD > (CURDATE()+9)");
			
			//Query query = session.createQuery("from Item as i where  i.EXD >=CURDATE()");
			
			 result = query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
			    	

	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Item> findByQuantity(Long quantity) {
		
		
		Session session = sessionFactory.getCurrentSession();
		List<Item> result= null;
		try {
			
			//Query to retrieve drug items which are nearing to minimum quantity
			 Query query = session.createQuery("from Item as i where  i.quantity <=50");
			
			 result = query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
			
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reg> findAllSuppliers() {
		Session session = sessionFactory.getCurrentSession();
		List<Reg> result = null;
		try {
			Query query = session.createQuery("SELECT r.firstName from Reg  r  where r.position ='Supplier' ");
			
			
			
			 result = query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

	
	@Override
	public void save(Disease disease) {
		sessionFactory.getCurrentSession().save(disease);
		
	}
	
	}
	
	
	
	
