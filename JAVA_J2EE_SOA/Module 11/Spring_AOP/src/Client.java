

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import test.CustomerService;
 
public class Client {
	public static void main(String[] args) {
		
	    Resource r=new ClassPathResource("Beans.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);
	    
	    CustomerService cs=(CustomerService) factory.getBean("customerServiceProxy",CustomerService.class);  
	    cs.printName();
	    cs.printURL();
 
	}
}