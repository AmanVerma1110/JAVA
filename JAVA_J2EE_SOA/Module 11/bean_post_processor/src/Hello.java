
public class Hello {
	   public String msg;

	   public String getmsg() {
		return msg;
	}

	public void setmsg(String msg) {
		this.msg = msg;
	}

	public void init(){
	      System.out.println("Bean is initialized here...");
	   }

	   public void destroy(){
	      System.out.println("Bean is destoryed here...");
	   }
	}
