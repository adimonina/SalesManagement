package dbIMPL;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.HibernateUtil;
import dbAPI.CanceledOrdersDBApi;
import model.CanceledOrders;
import model.Customer;

public class CanceledOrdersDBImpl implements CanceledOrdersDBApi {
	
	  public void saveCanceledOrders (CanceledOrders canceledOrders)
	  {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.save(canceledOrders);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();}
		        e.printStackTrace();
		        
	  }
	  }

	@Override
	public void readCanceledOrders(UUID canceledOrdersID) {
		// TODO Auto-generated method stub
	}

	@Override
	public void readAllCanceledOrdersByCustomer(int customerID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAllCanceledOrders() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCanceledOrders(CanceledOrders canceledOrders) {
		// TODO Auto-generated method stub
		
	}

}
