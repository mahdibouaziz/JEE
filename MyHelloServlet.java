import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyHelloServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Bonjour tout le monde</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Bonjour tout le monde</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}