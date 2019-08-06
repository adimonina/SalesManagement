package service;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;
import db.HibernateUtil;
import model.Administrator;
import model.Customer;

public class Service {
	
	public static boolean testingAdminOrCustomer (String id)
	{
	//if the method returns true, the user is an admin, if it returns false, the user is a customer	
		String splitedID []=id.split("-");
		if((id.length()!=36)||(splitedID.length!=5)||(splitedID[0].length()!=8)||(splitedID[1].length()!=4)||(splitedID[2].length()!=4)||(splitedID[3].length()!=4)||(splitedID[4].length()!=12))
		{
			return false;
		}
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        if(session.get(Administrator.class,UUID.fromString(id))!=null)
		        {
		        	return true;
		        }
		        else {
		        	if(session.get(Customer.class, UUID.fromString(id))!=null)
		        		{	
		        		return false;
		        		}
		        }	
		        transaction.commit();
		    } catch (Exception e) 
			{
		       if(transaction != null) 
		       {
		       transaction.rollback();
		       }
		        e.printStackTrace();	        
		    }
			
	return false;
	}

	}