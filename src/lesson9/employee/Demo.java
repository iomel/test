package lesson9.employee;

import lesson9.employee.utils.Checker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company();

        System.out.println(company.countryFounded);
        System.out.println(company.name);

        company.name = "IBM";

        Checker checker = new Checker();


    }
}
