
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class postProcessor implements BeanPostProcessor {
 
   public Object postProcessBeforeInitialization(Object bean,
                 String beanName) throws BeansException {
      System.out.println("Before the constructor is called.... : " + beanName);
      return bean;  // you can return any other object as well
   }

   public Object postProcessAfterInitialization(Object bean,
                 String beanName) throws BeansException {
      System.out.println("After the constructor is called... : " + beanName);
      return bean;  // you can return any other object as well
   }

}