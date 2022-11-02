 

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class StoreData {
	private static SessionFactory factory;
	
	//Obtains the session factory. 
	public static void getSessionFactory()
	   {
			
			try{
				Configuration conf = new Configuration().configure();						
			    StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			    factory= conf.buildSessionFactory(builder.build());		 

			}catch (Throwable ex) { 
				System.err.println("Failed to create sessionFactory object." + ex);
				throw new ExceptionInInitializerError(ex); 
			}
	   }

	
public static void main(String[] args) {
	 getSessionFactory();
	 
	 Session session = factory.openSession();
	
	Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();
	e1.setName("Kavya");
	
	Regular_Employee e2=new Regular_Employee();
	e2.setName("Nala");
	e2.setSalary(50000);
	e2.setBonus(5);
	
	Contract_Employee e3=new Contract_Employee();
	e3.setName("Rajan");
	e3.setPay_per_hour(1000);
	e3.setContract_duration("15 hours");
	
	session.persist(e1);
	session.persist(e2);
	session.persist(e3);
	
	t.commit();
	session.close();
	System.out.println("success");
}
}
