package br.com.rafaelvieira.managerproject.servelt;

import br.com.rafaelvieira.managerproject.JDBC.DataBase;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DeleteCompanyServlet", value = "/deleteCompany")
public class DeleteCompanyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        DataBase dataBase = new DataBase();
        dataBase.delete(id);

        System.out.println("Deleting company with id: " + id);

        response.sendRedirect("listCompany");

    }

}
