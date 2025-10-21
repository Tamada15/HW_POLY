package org.yourcompany.yourproject;

import org.yourcompany.yourproject.taxes.TaxSystemIncome;
import org.yourcompany.yourproject.taxes.TaxSystemIncomeMinusExpenses;

public class Project {

    public static void main(String[] args) {
        TaxSystemIncome taxSystemIncome = new TaxSystemIncome();
        TaxSystemIncomeMinusExpenses taxSystemIncomeMinusExpenses = new TaxSystemIncomeMinusExpenses();
        Company firstCompany = new Company("Steam", taxSystemIncome);
        firstCompany.shiftMoney(200);
        firstCompany.shiftMoney(-100);
        firstCompany.payTaxes();
        firstCompany.SetTaxSystem(taxSystemIncomeMinusExpenses);
        firstCompany.shiftMoney(200);
        firstCompany.shiftMoney(-100);
        firstCompany.payTaxes();

    }
}
