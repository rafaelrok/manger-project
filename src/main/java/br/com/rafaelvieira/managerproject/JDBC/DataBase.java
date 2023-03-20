package br.com.rafaelvieira.managerproject.JDBC;

import br.com.rafaelvieira.managerproject.model.Company;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<Company> companies = new ArrayList<>();
    public void save(Company company) {
        companies.add(company);
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
