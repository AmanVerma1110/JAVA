import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Client {
   private static SessionFactory factory; 
   public static void main(String[] args) {
		try{
			Configuration conf = new Configuration().configure();						
		    StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		    factory= conf.buildSessionFactory(builder.build());		 

		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
      Client ME = new Client();

      /* Add employee records in batches */
      ME.addEmployees( );
   }
   /* Method to create employee records in batches */
   public void addEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         for ( int i=0; i<100000; i++ ) {
            String fname = "First Name " + i;
            String lname = "Last Name " + i;
            Integer salary = i;
            Employee employee = new Employee(fname, lname, salary);
            
            session.save(employee);

         	if (i % 1000 == 0)
         		System.out.println("Record : " + i + " is inserting into db...Please wait...");
         }
         tx.commit();
      }catch (HibernateException e) {
    	  System.out.println(e);
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
    	  System.out.println("In finally block...");
         session.close(); 
      }
      return ;
   }
}