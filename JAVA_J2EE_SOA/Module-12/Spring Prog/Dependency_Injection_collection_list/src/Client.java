import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      BeanCollection allCountries=(BeanCollection)context.getBean("countries");

      allCountries.getCountries();

   }
}
