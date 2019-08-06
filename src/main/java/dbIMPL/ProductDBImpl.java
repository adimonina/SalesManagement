package dbIMPL;

import org.hibernate.Session;
import org.hibernate.Transaction;
import db.HibernateUtil;
import dbAPI.ProductDBApi;
import model.Customer;
import model.Product;
import service.Service;
public class ProductDBImpl implements ProductDBApi{

	 public void saveProduct (Product product)
	  {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.save(product);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		    	   transaction.rollback();
		       }
		        e.printStackTrace();
		        
	  }
	  }  
	 
		@Override
		public void deleteProduct(Product product) {
			  Transaction transaction = null;
				try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			        transaction = session.beginTransaction();
			        session.delete(product);
			        transaction.commit();
			    } catch (Exception e) {
			       if(transaction != null) {
			       transaction.rollback();}
			        e.printStackTrace();
			    }
		}
		

	@Override
	public void deleteAllProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readProduct(int productID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAllProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortProductByPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readProducInStock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updteProduct(int productID) {
		// TODO Auto-generated method stub
		
	}


}
