package br.com.rafaelvieira.managerproject.servelt;

import br.com.rafaelvieira.managerproject.JDBC.DataBase;
import br.com.rafaelvieira.managerproject.model.Company;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "NewCompanyServelet", value = "/newCompany")
public class NewCompanyServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");

        String nameCompany = request.getParameter("name");
        String dateInitialCompany = request.getParameter("initialDate");

        Date initialDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            initialDate = sdf.parse(dateInitialCompany);
            } catch (Exception e) {
            throw new ServletException(e);
        }

        Company company = new Company();
        company.setName(nameCompany);
        company.setInitialDate(initialDate);

        DataBase dataBase = new DataBase();
        dataBase.save(company);

        RequestDispatcher rd = request.getRequestDispatcher("/newCompany.jsp");
        request.setAttribute("company", company.getName());
        rd.forward(request, response);
    }
}
