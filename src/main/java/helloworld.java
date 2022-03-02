

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloworld
 */
@WebServlet("/helloworld")
public class helloworld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloworld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><title></title><style>body{\n"
				+ "	background-color:greenyellow;\n"
				+ "	color:violet;\n"
				+ "}\n"
				+ "h1{\n"
				+ "	display:flex;\n"
				+ "	font-size:50px;\n"
				+ "	justify-content:center;\n"
				+ "	align-items:center;\n"
				+ "}</style></head>");
		pw.print("<body><h1>hello world</h1></body></html>");
	}

}
