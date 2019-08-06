package dbIMPL;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.HibernateUtil;
import dbAPI.OrderDBApi;
import model.Customer;
import model.Order;

public class OrderDBImpl implements OrderDBApi {

	
	  public void saveOrder (Order order)
	  {
		  
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.save(order);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();
		       }
		        e.printStackTrace();
		        
	  }
	  }

	@Override
	public void deleteOrder(Order order) {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.delete(order);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();}
		        e.printStackTrace();
		    }
	}

	@Override
	public void deleteAllOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readOrder(UUID orderID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAllOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readOrderByCustomer(UUID customerID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortOrderByTotalPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readOrderByMonth(int month) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(UUID orderID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readOrderBySeason(String season) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cityBoughtTheMost() {
		// TODO Auto-generated method stub
		
	}
}
