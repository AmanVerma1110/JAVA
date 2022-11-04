

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("helloBean.xml");

      Hello  obj1 = (Hello) context.getBean("hello"); 
      obj1.getMsg();
      
   }
}