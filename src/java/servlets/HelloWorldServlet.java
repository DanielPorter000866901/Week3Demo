package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author porte
 */
public class HelloWorldServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // forward get requests to /WEB-INF/helloWorldForm.jsp. The web.xml file sends a GET when the app is run.
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        
        request.setAttribute("firstname", firstname);
        request.setAttribute("lastname", lastname);
        
        if (firstname == null || firstname.equals("") || lastname == null || lastname.equals("")) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
            return;
        }
        
        // forward form data to another page.
        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);
    }

}
