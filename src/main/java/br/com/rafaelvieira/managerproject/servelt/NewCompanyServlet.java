package br.com.rafaelvieira.managerproject.servelt;

import br.com.rafaelvieira.managerproject.JDBC.DataBase;
import br.com.rafaelvieira.managerproject.model.Company;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "NewCompanyServelet", value = "/newCompany")
public class NewCompanyServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");

        String nameCompany = request.getParameter("name");
        Company company = new Company();
        company.setName(nameCompany);

        DataBase dataBase = new DataBase();
        dataBase.save(company);

        RequestDispatcher rd = request.getRequestDispatcher("/newCompany.jsp");
        request.setAttribute("company", company.getName());
        rd.forward(request, response);
    }
}
