
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Client {
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

		Client client_1 = new Client();
		/* Let us have a set of certificates for the first employee  */
		ArrayList set1 = new ArrayList();
		set1.add(new Certificate("MCA"));
		set1.add(new Certificate("MBA"));
		set1.add(new Certificate("PMP"));

		/* Add employee records in the database */
		Integer empID1 = client_1.InsertRecordInDatabase( "Manoj", "Kumar", 4000, set1);

		/* Another set of certificates for the second employee  */
		ArrayList set2 = new ArrayList();
		set2.add(new Certificate("BCA"));
		set2.add(new Certificate("MCA"));

		/* Add another employee record in the database */
		Integer empID2 = client_1.InsertRecordInDatabase("Dilip", "Kumar", 3000, set2);

		/* List down all the employees */
		client_1.DisplayRecords();

	}

	/* Method to CREATE an employee in the database */
	public Integer InsertRecordInDatabase( String fname, String lname, int salary, ArrayList cert) throws HibernateException 
	{
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();;

		Employee e1 = new Employee(fname, lname, salary);
		e1.setCertificates(cert);
		Integer empId = (Integer) session.save(e1); 
		tx.commit();

		session.close();    
		return empId;
	} 


	/* Method to  READ all the employees */
	public void DisplayRecords( ) throws HibernateException{
		Session session = factory.openSession();
		List empLst = session.createQuery("FROM Employee").list(); 
		for (Iterator iterator = 
				empLst.iterator(); iterator.hasNext();){
			Employee emp = (Employee) iterator.next(); 
			System.out.print("First Name: " + emp.getFirstName()); 
			System.out.print("  Last Name: " + emp.getLastName()); 
			System.out.println("  Salary: " + emp.getSalary()); 
			List certificates = emp.getCertificates();
			for (Iterator iterator2 = 
					certificates.iterator(); iterator2.hasNext();){
				Certificate certName = (Certificate) iterator2.next(); 
				System.out.println("Certificate: " + certName.getName()); 

			}
		}
		session.close(); 
	}

}