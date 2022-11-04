

public class Hello {
	     String Msg;

	   public void setMsg(String Msg){
	      this.Msg  = Msg;
	   }

	   public void getMsg(){
	      System.out.println("Your Message : " + Msg);
	   }	  
	   
	   public void init()
	   {
		   System.out.println("Do the bean initialization here...");
	   }
	   
	   public void Destroy()
	   {
		   System.out.println("Just befor bean getting destoryed...");
	   }

	}
