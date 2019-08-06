	package dbIMPL;
	import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.Session;
	import org.hibernate.Transaction;
	import db.HibernateUtil;
import dbAPI.OrderDetailsDBApi;
import model.OrderDetails;

	public class OrderDetailsDBImpl implements OrderDetailsDBApi{

		  public void saveOrderDetails (OrderDetails orderDetails)
		  {
			  Transaction transaction = null;
				try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			        transaction = session.beginTransaction();
			        session.save(orderDetails);
			        transaction.commit();
			    } catch (Exception e) {
			       if(transaction != null) {
			       transaction.rollback();}
			        e.printStackTrace();
			        
		  }
		  }

		@Override
		public void calculateTotalPrice(UUID orderID) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateTotalPrice(UUID orderID) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void QuantityOfUnitsPurchased(UUID productID) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void SizeToColorRatio(String size, String color) {
			// TODO Auto-generated method stub
			
		}
}
