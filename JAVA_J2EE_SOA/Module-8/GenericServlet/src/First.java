import java.io.*;
import javax.servlet.*;

public class First extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
			throws IOException,ServletException
	{

		res.setContentType("text/html");

		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b><h1> Charan is learning Servlets</h1></b>");
		out.print("</body></html>");
	}
}