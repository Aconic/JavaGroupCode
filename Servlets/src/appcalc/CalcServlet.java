package appcalc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CalcServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
//        int x = 0;
//        int y = 0;
//        String sign="";
//        String sx = request.getParameter("x");
//        String sy = request.getParameter("y");
//        String ssign = request.getParameter("sign");
//        if (!sx.isEmpty())
//        {
//            x = Integer.parseInt(request.getParameter("x"));
//        }
//        if (!sy.isEmpty())
//        {
//            y = Integer.parseInt(request.getParameter("y"));
//        }
//        if (!ssign.isEmpty())
//        {
//            sign = request.getParameter("sign");
//        }
        int x = 3;
        int y =6;
        String sign = "-";

        int res = 0;
//        if (sign.equals("plus"))
//        {
//            res = x + y;
//        }
//        else if (sign.equals("-"))
//        {
//            res = x - y;
//        }
//        else if (sign.equals("/") && y != 0)
//        {
//            res = x / y;
//        }
//        else if (sign.equals("*"))
//        {
//            res = x * y;
//        }
        request.setAttribute("res", res);
        request.getRequestDispatcher("calc.jsp").forward(request, response);
        response.setContentType("text/html");
        response.getWriter().write(String.valueOf(res));
        response.getWriter().println(res);
    }
}
