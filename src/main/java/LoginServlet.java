import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Login Servlet Demo",
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "user", value = "Tahir"),
                @WebInitParam(name = "pass", value = "tahir123")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String password = req.getParameter("pass");

        String user = getServletConfig().getInitParameter("user");
        String pass = getServletConfig().getInitParameter("pass");

        if (ValidUserInformation.isValidUsername(user)) {
            if (user.equals(username) && pass.equals(password)) {
                req.setAttribute("user", username);
                req.getRequestDispatcher("LoginSuccess.jsp").forward(req, resp);
            } else {
                failedLogin(req, resp, "Username or Password is Incorrect...");
            }
        } else {
            failedLogin(req,resp,"Username must Start with Capital Letter and Contain 3 Char at least.");
        }
    }

    public void failedLogin(HttpServletRequest req, HttpServletResponse resp, String message) {
        try {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/login.html");
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<h3>"+message+"</h3>");
            requestDispatcher.include(req, resp);
        } catch (IOException ioe) {
        } catch (ServletException servexp) {
        }
    }
}
