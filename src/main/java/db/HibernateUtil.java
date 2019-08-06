package db;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Administrator;
import model.CanceledOrders;
import model.Customer;
import model.Order;
import model.OrderDetails;
import model.Product;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory()
    {
    	  if (sessionFactory == null) {
    		  try {
		Configuration cfg = new Configuration();
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "org.postgresql.Driver");
        settings.put(Environment.URL, "jdbc:postgresql://127.0.0.1:5432/salesManagement");
        settings.put(Environment.USER, "postgres");
        settings.put(Environment.PASS, "1398bf4c");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "none");
        cfg.setProperties(settings);
        cfg.addAnnotatedClass(Customer.class);
        cfg.addAnnotatedClass(Product.class);
        cfg.addAnnotatedClass(Administrator.class);
        cfg.addAnnotatedClass(Order.class);
        cfg.addAnnotatedClass(OrderDetails.class);
        cfg.addAnnotatedClass(CanceledOrders.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(cfg.getProperties()).build();

      sessionFactory = cfg.buildSessionFactory(serviceRegistry);
    		  }
    		  catch (Exception e) {
                  e.printStackTrace();
              }
    	  }
    	  return sessionFactory;
    }
}
