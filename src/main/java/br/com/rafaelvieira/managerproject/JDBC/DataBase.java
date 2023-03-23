package br.com.rafaelvieira.managerproject.JDBC;

import br.com.rafaelvieira.managerproject.model.Company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DataBase {

    private static final List<Company> companies = new ArrayList<>();
    private static Integer id = 1;

    static {
        Company company = new Company();
        company.setId(id++);
        company.setName("Microsoft");
        Company company2 = new Company();
        company2.setId(id++);
        company2.setName("Google");
        companies.add(company);
        companies.add(company2);
    }

    public void save(Company company) {
        companies.add(company);
    }

    public Company findById(Integer id) {
            for(Company company : companies) {
                if(Objects.equals(company.getId(), id)) {
                    return company;
                }
//                else {
//                    throw new IllegalArgumentException("Company not found");
//                }
            }
            return null;
    }

    public void delete(Integer id) {

        Iterator<Company> iterator = companies.iterator();
        while(iterator.hasNext()) {
            Company company = iterator.next();
            if(Objects.equals(company.getId(), id)) {
                iterator.remove();
            }
        }

//        for(Company company : companies) {
//            if(Objects.equals(company.getId(), id)) {
//                companies.remove(company);
//                break;
//            }
//        }
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
