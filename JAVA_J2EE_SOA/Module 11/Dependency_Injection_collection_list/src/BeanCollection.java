import java.util.List;

public class BeanCollection {
   List Countries;

   // a setter method to set List
   public void setCountries(List Countries) {
      this.Countries = Countries;
   }
   // prints and returns all the elements of the list.
   public List getCountries() {
      System.out.println("List Elements :"  + Countries);
      return Countries;
   }
}