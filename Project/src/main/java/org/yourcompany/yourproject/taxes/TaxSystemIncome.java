package org.yourcompany.yourproject.taxes;

public class TaxSystemIncome extends TaxSystem
{
    @Override
    public int calcTaxFor(int debit, int credit) {
        double tax = debit*0.06;
        if (tax<=0) return 0;
        return (int)Math.round(tax);
    }
}

