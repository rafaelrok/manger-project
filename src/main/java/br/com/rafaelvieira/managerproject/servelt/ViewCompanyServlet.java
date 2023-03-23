package br.com.rafaelvieira.managerproject.servelt;

import br.com.rafaelvieira.managerproject.JDBC.DataBase;
import br.com.rafaelvieira.managerproject.model.Company;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ViewCompanyServlet", value = "/viewCompany")
public class ViewCompanyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        DataBase dataBase = new DataBase();
        Company company = dataBase.findById(id);

        System.out.println(company.getName());

        request.setAttribute("company", company);
        RequestDispatcher rd = request.getRequestDispatcher("/pages/company/form/formUpdateCompany.jsp");
        rd.forward(request, response);

        response.getWriter().append("Served at: ").append(request.getContextPath());

    }

}
