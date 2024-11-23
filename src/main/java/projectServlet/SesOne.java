package projectServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SesOne")
public class SesOne extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail = req.getParameter("umail");
		String pass = req.getParameter("upass");
		if(mail.equals("abc@gmail.com")&& pass.equals("abc123")) {
			HttpSession session =req.getSession();
			session.setAttribute("k1",mail);
			resp.sendRedirect("SesTwo");
		}
		else {
			resp.getWriter().print("Invalid credential");
		}
		
	}
}
