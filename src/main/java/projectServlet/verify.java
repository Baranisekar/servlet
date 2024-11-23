package projectServlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/verify")
public class verify extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String mail = req.getParameter("u_mail");
		String pass = req.getParameter("u_pass");
		res.getWriter().print(mail + " " + pass );
		
	}

}
