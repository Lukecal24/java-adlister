import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class IndexServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();
        // Use a method on the dao to get all the products
        List<Ad> ads = adsDao.all();
        // Pass the data to the jsp
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }


}
