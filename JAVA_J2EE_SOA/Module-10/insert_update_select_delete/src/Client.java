
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

		try
		{

			 getSessionFactory();
			 Client client_1 = new Client();

			/* Add few employee records in database */
			 client_1.InsertRecordInDatabase(1,"Pavas", "sisodia", 1000);
			 client_1.InsertRecordInDatabase(2,"Charan", "Kumar", 5000);
			 client_1.InsertRecordInDatabase(3,"Rohit", "Devgun", 10000);

			/* List down all the employees */
			System.out.println("Listing employees..");
			client_1.DisplayRecords();


			/* Update employee's records */
			System.out.println("UPdated the record..");
			client_1.UpdateRecord(1, 5000);

			/* Delete an employee from the database */
			System.out.println("Deleted the 3rd Record...");
			client_1.DeleteRecord(3);

			/* List down new list of the employees */
			System.out.println("Listing all the employees...");
			client_1.DisplayRecords();
		}
		catch (HibernateException e)
		{
			System.out.println("Exception is : " + e);
		}
	}

	/* Method to CREATE an employee in the database */
	public Integer InsertRecordInDatabase(int id, String fname, String lname, int salary) throws HibernateException 
	{
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();;
 
		Employee e1 = new Employee(id, fname, lname, salary);
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

		}
		session.close(); 
	}



	/* Method to UPDATE salary for an employee */
	public void UpdateRecord(Integer EmpId, int salary ) throws HibernateException
	{
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();;
	 
		Employee employee = 
				(Employee)session.get(Employee.class, EmpId); 
		employee.setSalary( salary );
		session.update(employee); 
		tx.commit(); 
		session.close();  
	}


	/* Method to DELETE an employee from the records */
	public void DeleteRecord(Integer EmployeeID) throws HibernateException
	{
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = 
				(Employee)session.get(Employee.class, EmployeeID); 
		session.delete(employee); 
		tx.commit();   
		session.close(); 

	}
}