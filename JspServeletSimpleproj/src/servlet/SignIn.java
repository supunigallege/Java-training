package servlet;
import controller.DB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/SignIn")
public class SignIn extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("signin");


        String email=request.getParameter("email");
        String uname=request.getParameter("uname");
        String password=request.getParameter("password");

        ServletContext servletContext = request.getServletContext();

        if(servletContext.getAttribute("db")==null){

            System.out.println("database null");

        }else{

            System.out.println("database exists");
        }




    }

}
