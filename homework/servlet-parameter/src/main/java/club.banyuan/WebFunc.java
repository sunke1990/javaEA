package club.banyuan;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/func")
public class WebFunc extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        double x=Double.parseDouble(req.getParameter("x")) ;
//        double y=Double.parseDouble(req.getParameter("y")) ;
//        double z=x*y;
       Integer a= Integer.parseInt(req.getParameter("x"));
       Integer b= Integer.parseInt(req.getParameter("y"));
       int c=a*b;
       resp.getWriter().append("hhhhhh");
        resp.getWriter().append(Integer.toString(c));
    }
}
