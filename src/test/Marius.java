package test;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Marius extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		
		
		resp.sendRedirect("marius/marius.jsp");
	}
}
