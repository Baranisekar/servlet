package projectServlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/S2")
public class S2 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		long num =(long)req.getAttribute("con");
		String mail =(String)req.getAttribute("mail");
		res.getWriter().print(num+" "+mail);
		
	}

}
