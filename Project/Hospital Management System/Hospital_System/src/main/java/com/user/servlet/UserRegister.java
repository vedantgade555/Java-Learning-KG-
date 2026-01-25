import java.io.IOException;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;
import com.sun.jdi.connect.spi.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String fullName = req.getParameter("fullname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User u = new User(fullName, email, password);

        Connection conn = DBConnect.getConn();

        if (conn == null) {
            System.out.println("❌ Database connection failed");
            resp.sendRedirect("error.jsp");
            return;
        }

        UserDao dao = new UserDao(conn);
        boolean success = dao.userRegister(u);

        if (success) {
            resp.sendRedirect("success.jsp");
        } else {
            resp.sendRedirect("register.jsp");
        }
    }
}
