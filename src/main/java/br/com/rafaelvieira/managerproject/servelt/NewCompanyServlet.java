package br.com.rafaelvieira.managerproject.servelt;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NewCompanyServelet", value = "/newCompany")
public class NewCompanyServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Cadastrando nova empresa");
        String nameCompany = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Empresa " + nameCompany + " cadastrada com sucesso");
        out.println("</body>");
        out.println("</html>");

    }
}
