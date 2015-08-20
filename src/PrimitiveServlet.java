import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zyw on 2015/8/13.
 */
public class PrimitiveServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service in");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("this is 1");
        printWriter.print("this is 2");


    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy!");

    }
}
