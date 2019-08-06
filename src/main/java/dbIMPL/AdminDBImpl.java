package dbIMPL;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;
import db.HibernateUtil;
import dbAPI.AdministratorDBApi;
import model.Administrator;


public class AdminDBImpl implements AdministratorDBApi  {

	
	  public void saveAdmin (Administrator admin)
	  {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.save(admin);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();}
		        e.printStackTrace();
		        
	  }
	  }

	  @Override
		public void deleteAdmin(Administrator admin)  {
		  Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        session.delete(admin);
		        transaction.commit();
		    } catch (Exception e) {
		       if(transaction != null) {
		       transaction.rollback();}
		        e.printStackTrace();
		    }
	}

	
	
	@Override
	public void readAdmin(UUID adminID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAllAdmin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdmin(UUID adminID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllAdmin() {
		// TODO Auto-generated method stub
		
	}

}