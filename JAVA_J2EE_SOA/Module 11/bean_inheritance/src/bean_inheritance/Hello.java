package bean_inheritance;

public class Hello {
	private String message1;


	public void setMessage1(String message){
		this.message1  = message;
	}


	public void getMessage1(){
		System.out.println("World Message1 : " + message1);
	}
	
	public String returnHi()
	{
		return "Hello...how are you...";
	}

}