package com.levelup;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.saveEmployeesInFile(company.path);
        company.readEmployeesFromFile(company.path);
    }


}
