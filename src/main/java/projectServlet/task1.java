package projectServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/task1")
public class task1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int uid = Integer.parseInt(req.getParameter("u-id"));
		String un =  req.getParameter("u-name");
		String um = req.getParameter("u-email");
		long con = Long.parseLong(req.getParameter("u-pno"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
			PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,? )");
			ps.setInt(1, uid);
			ps.setString(2, un);
			ps.setString(3, um);
			ps.setLong(4, con);
			int a = ps.executeUpdate();
			cn.close();
			res.getWriter().print(a+"row updated");
		} catch (ClassNotFoundException | SQLException e) {
	
			e.printStackTrace();
		}
		
		
		
	}

}
