package br.com.rafaelvieira.managerproject.servelt;

import br.com.rafaelvieira.managerproject.JDBC.DataBase;
import br.com.rafaelvieira.managerproject.model.Company;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "UpdateCompanyServlet", value = "/updateCompany")
public class UpdateCompanyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");

        String nameCompany = request.getParameter("name");
        String dateInitialCompany = request.getParameter("initialDate");
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Date initialDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            initialDate = sdf.parse(dateInitialCompany);
        } catch (Exception e) {
            throw new ServletException(e);
        }

        System.out.println(id);

        DataBase dataBase = new DataBase();
        Company company = dataBase.findById(id);
        company.setName(nameCompany);
        company.setInitialDate(initialDate);

        response.sendRedirect("listCompany");

    }
}
