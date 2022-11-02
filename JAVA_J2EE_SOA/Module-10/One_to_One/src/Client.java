import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
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

      /* Let us have one address object */
      Address address1 = client_1.InsertAddressInDB("Kondapur","Hyderabad","AP","532");

      /* Add employee records in the database */
      Integer empID1 = client_1.InsertEmployeeInDB(2,"Nala", "shekar", 4000, address1);

      /* Let us have another address object */
      Address address2 = client_1.InsertAddressInDB("Saharanpur","Ambehta","UP","111");
  
    /* Add another employee record in the database */
      Integer empID2 = client_1.InsertEmployeeInDB(4,"Kavya", "Shree", 3000, address2);
      
      System.out.println("Listing the employees after adding the to the db....");

      /* List down all the employees */
      client_1.displayRecords();
 

   }

   /* Method to add an address record in the database */
   public Address InsertAddressInDB(String street, String city, 
                             String state, String zipcode) {
      Session session = factory.openSession();
      Transaction tx = session.beginTransaction();
      Address address = new Address(street, city, state, zipcode);
      Integer addressID = (Integer) session.save(address); 
      tx.commit();
      session.close(); 
      
      return address;
   }

   /* Method to add an employee record in the database */
   public Integer InsertEmployeeInDB(int id, String fname, String lname, 
                              int salary, Address address){
      Session session = factory.openSession();
 
    	  Transaction tx = session.beginTransaction();
         Employee employee = new Employee(id, fname, lname, salary, address);
         Integer employeeID = (Integer) session.save(employee); 
         tx.commit();
 
         session.close();  
      return employeeID;
   }

   /* Method to list all the employees detail */
   public void displayRecords( ){
         Session session = factory.openSession();
      
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary());
            Address add = employee.getAddress();
            System.out.println("Address ");
            System.out.println("\tStreet: " +  add.getStreet());
            System.out.println("\tCity: " + add.getCity());
            System.out.println("\tState: " + add.getState());
            System.out.println("\tZipcode: " + add.getZipcode());
         }
         
         session.close();  
   } 
}