package org.yourcompany.yourproject.taxes;

public class TaxSystemIncomeMinusExpenses extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxBase = debit - credit;
        int tax = (int) Math.round(taxBase * 0.15);
        int minTax = (int) Math.round(debit * 0.01);
        return Math.max(tax, minTax);
    }
}
