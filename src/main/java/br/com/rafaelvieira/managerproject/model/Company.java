package br.com.rafaelvieira.managerproject.model;

import java.util.Date;


public class Company {

    private Integer id;
    private String name;
    private Date initialDate = new Date();

    public Company() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }
}
