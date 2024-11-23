package projectServlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/task2")
public class task2 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email= req.getParameter("u-mail");
		req.setAttribute("mail", email);
		long con = Long.parseLong(req.getParameter("u-con"));
		req.setAttribute("con", con);
		RequestDispatcher rd = req.getRequestDispatcher("S2");
		rd.forward(req, res);
	}

}
