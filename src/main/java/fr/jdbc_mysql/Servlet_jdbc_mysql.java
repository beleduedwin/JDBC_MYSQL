package fr.jdbc_mysql;

import com.mysql.cj.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_jdbc_mysql", urlPatterns = {"/jdbc_mysql"})

public class Servlet_jdbc_mysql extends HttpServlet {

    //...... doGet Methode
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//....Connect
        Connection connection = null;

        try {

            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/starwars?serverTimezone=UTC", "root", "root");
        } catch (SQLException e) {
            throw new ServletException(e);
        }

        List<Jedi_masters> myJediList = new ArrayList<>();

        try {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from jedi_masters");

        while (rs.next()){
            //create jedi
            Jedi_masters jedi= new Jedi_masters();
            jedi.setName(rs.getString("name"));
            jedi.setSurname(rs.getString("surname"));

            myJediList.add(jedi);
        }

        statement.close();

        } catch (
        SQLException e) {
            e.printStackTrace();
        }

        //return myJediList;
        request.setAttribute("myJediList", myJediList);
        request.getRequestDispatcher("/jediList.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
