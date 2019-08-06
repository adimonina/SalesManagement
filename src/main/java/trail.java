import java.text.Annotation;
import java.time.LocalDate;
import java.util.Properties;
import javax.swing.text.DefaultEditorKit.CutAction;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import com.fasterxml.classmate.AnnotationConfiguration;
import javassist.bytecode.AnnotationsAttribute;

/*public class trail {

	public static void main(String[] args) {
		//Session se = HibernateUtil.getSessionFactory().openSession();
		//se.beginTransaction();
		//Customer first= new Customer(85, "adi" , "yalin david" , "adimonina@gmail,com" , 0545266 , LocalDate.of(1998, 04, 19), true);
		//se.getTransaction().commit();
		//AnnotationConfiguration cfg = new AnnotationConfiguration();
        //cfg.addAnnotatedClass(Customer.class);
	    final SessionFactory sessionFactory;
		Configuration cfg = new Configuration();
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "org.postgresql.Driver");
        settings.put(Environment.URL, "jdbc:postgresql://127.0.0.1:5432/salesManagement");
        settings.put(Environment.USER, "postgres");
        settings.put(Environment.PASS, "1398bf4c");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		cfg.addClass(Customer.class);
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        //settings.put(Environment.HBM2DDL_AUTO, "create-drop");
        settings.put(Environment.HBM2DDL_AUTO, "none");
        cfg.setProperties(settings);
        cfg.addAnnotatedClass(Customer.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(cfg.getProperties()).build();
       sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		//cfg.addResource("Customer.hbm.xml");
        //cfg.configure();
        //SessionFactory se = cfg.buildSessionFactory();
       
       
       Transaction transaction = null;
       try (Session session = sessionFactory.openSession()) {
           // start a transaction
           transaction = session.beginTransaction();
           // save the student object
           Customer first = new Customer(85,"adi" , 1258 , "adimonina@gmail.com" , 139 , LocalDate.of(1998, 04, 19), true);

           session.save(first);
           // commit transaction
           transaction.commit();
       } catch (Exception e) {
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
   }
     
}*/
