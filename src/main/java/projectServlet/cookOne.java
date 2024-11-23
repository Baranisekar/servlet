package projectServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookOne")
public class cookOne extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail = req.getParameter("mail");
		String password = req.getParameter("pwd");
		
		Cookie c1= new Cookie("k1", password);
		Cookie c2 = new Cookie("k2", mail);
		
		resp.addCookie(c2);
		resp.addCookie(c1);
		req.getRequestDispatcher("cookTwo").forward(req, resp);
		
	}
}
