package projectServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SesTwo")
public class SesTwo extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		String mail =(String)session.getAttribute("k1");
		if(mail!=null) {
			resp.getWriter().print("valid user");
		}
		else {
			resp.getWriter().print("inavlid user");
		}
	}
}
