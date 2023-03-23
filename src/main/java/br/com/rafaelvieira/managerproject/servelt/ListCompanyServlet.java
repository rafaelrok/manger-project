package br.com.rafaelvieira.managerproject.servelt;

import br.com.rafaelvieira.managerproject.JDBC.DataBase;
import br.com.rafaelvieira.managerproject.model.Company;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listCompany")
public class ListCompanyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DataBase dataBase = new DataBase();
        List<Company> list = dataBase.getCompanies();

        request.setAttribute("companies", list);

        RequestDispatcher rd = request.getRequestDispatcher("/pages/List/listCompany.jsp");
        rd.forward(request, response);



    }

}
