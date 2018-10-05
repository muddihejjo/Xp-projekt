package com.example.demo.base;

public class Customer {
    private int id;
    private String name;
    private String telephone;
    private String email;
    private boolean newsmail;
    private String companyName;

    //Constructor for SPRING when creating a new customer
    public Customer() {}

    //Constructor for DATABASE when retrieving all Customers
    public Customer(int id, String name, String telephone, String email, boolean newsmail, String companyName) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.newsmail = newsmail;
        this.companyName = companyName;
    }

    //Constructor for SPRING when a new Customer is created before inserted to database
    public Customer(String name, String telephone, String email, boolean newsmail, String companyName) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.newsmail = newsmail;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNewsmail() {
        return newsmail;
    }

    public void setNewsmail(boolean newsmail) {
        this.newsmail = newsmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
