package dashboard2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main")
public class Main extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h3>Hello World!</h3>");
        
		//logger.info("Atendiendo GET Bienvenida");
		System.out.println("Atendiendo get Main");
		HttpSession session = request.getSession();
		System.out.println("Session id: "+session.getId());
		//logger.info("Session new? "+session.isNew());
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Main.jsp");
		//RequestDispatcher view = request.getRequestDispatcher("pages/index.html");
		view.forward(request,response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Atendiendo post Main");
		HttpSession session = request.getSession();
		System.out.println("Session id: "+session.getId());
		
		
	}
}
