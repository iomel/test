package lesson9.employee.utils;

public class Checker {

    int companyNamesValidatedCount = 4;
    boolean checkCompanyName(String companyName)
    {
        return  (companyName != "Google" && companyName != "Amazon");
    }
}
