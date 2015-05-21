package appcalc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CalcServlet extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        float x = 0;
        float y = 0;
        String sign="";
        float res = 0;
        String strX = request.getParameter("x");
        String strY = request.getParameter("y");
        String strSign = request.getParameter("sign");
        if (!strX.isEmpty())
        {
            x = Float.parseFloat(request.getParameter("x"));
        }
        if (!strY.isEmpty())
        {
            y = Float.parseFloat(request.getParameter("y"));
        }
        if (!strSign.isEmpty())
        {
            sign = request.getParameter("sign");
        }
        if (sign.equals("+"))
        {
            res = x + y;
        }
        else if (sign.equals("-"))
        {
            res = x - y;
        }
        else if (sign.equals("/") && y != 0)
        {
            res = x / y;
        }
        else if (sign.equals("*"))
        {
            res = x * y;
        }
        String resStr = String.format("%.2f", res);
        request.setAttribute("result", resStr);
        request.getRequestDispatcher("calc.jsp").forward(request, response);
      //request.getRequestDispatcher("calc-aj.jsp").forward(request, response);
        response.setContentType("text/html");
    }
}
