import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="imc", urlPatterns = {"/imc"})
public class Main extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, resp);
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, resp);
		
	}
	
	
}