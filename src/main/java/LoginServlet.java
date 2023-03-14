import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // don't create session if it doesn't exist
        if (session != null && session.getAttribute("user") != null) {
            // user is already logged in, redirect to profile
            response.sendRedirect("/profile");
        } else {
            // user is not logged in, show login page
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            HttpSession session = request.getSession(); // create new session
            session.setAttribute("user", username); // set user key in session
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}

