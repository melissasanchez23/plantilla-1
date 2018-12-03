import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Tarea2"})
public class NewServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ip=request.getRemoteAddr();
        String hora= new java.util.Date().toString();
        
        try (PrintWriter out = response.getWriter()) {
         
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Practica2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Practica2 at " + request.getContextPath() + "</h1>");
            out.println("La ip es: "+ip+"<br>");
            out.println("La fecha y hora es: "+hora+"<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
