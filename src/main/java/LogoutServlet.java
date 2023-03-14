import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // don't create session if it doesn't exist
        if (session != null) {
            session.removeAttribute("user"); // remove "user" attribute from session
            session.invalidate(); // invalidate session
        }
        response.sendRedirect("/login"); // redirect to login page
    }
}

