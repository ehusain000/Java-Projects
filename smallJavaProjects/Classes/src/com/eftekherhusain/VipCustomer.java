package com.eftekherhusain;

public class VipCustomer {

    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {

        this("Default Name", "default limit", "defualt email");
    }

    public VipCustomer(String name, String email) {

        this(name, "dafault email", "1000");
    }

    public VipCustomer(String name, String email, String creditLimit) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
