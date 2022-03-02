
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class firstservlet
 */
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			Statement st = con.createStatement();
			int sID = 1; 
			String sql = "select * from student where id="+sID;
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int sid = rs.getInt("sid");
				String sname = rs.getString("sname");
				String smobile = rs.getString("smobileno");
				pw.println(sid+" "+sname+" "+smobile);
				
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
	}

}
