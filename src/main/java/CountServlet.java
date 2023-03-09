import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/count")
public class CountServlet extends HttpServlet {
    public static int count = 0;
        public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
            String reset = request.getParameter("reset");
            if(reset != null) {
                count = 0;
            }
            response.getWriter().println("<h1>The current count is: " + count + "</h1>");
            count++;
        }
}
