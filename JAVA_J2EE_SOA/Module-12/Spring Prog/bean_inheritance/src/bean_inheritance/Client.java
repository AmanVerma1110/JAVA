package bean_inheritance;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      Hello objA = (Hello) context.getBean("helloBase");

       objA.getMessage1();


      HelloDerived objB = (HelloDerived) context.getBean("helloDerived");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
       
   }
}