package dbIMPL;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.HibernateUtil;
import dbAPI.CustomerDBApi;
import model.Customer;

public class CustomerDBImpl implements CustomerDBApi{

	  public void saveCustomer (Customer customer)
	  {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.save(customer);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();}
		        e.printStackTrace();
		        
	  }
	  }
	  
	  @Override
		public void deleteCustomer(Customer customer) 
	  {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.delete(customer);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();}
		        e.printStackTrace();
		        
	  }
	  }

	

	@Override
	public void readCustomer(UUID customerID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(UUID customerID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAllCustomers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllCustomers() {
		// TODO Auto-generated method stub
		
	}
}

	
