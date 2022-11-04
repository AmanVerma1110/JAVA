 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {

      AbstractApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
      Hello bean_object = (Hello) c.getBean("hello");
      System.out.println(bean_object.getmsg());
      c.registerShutdownHook();
   }
}