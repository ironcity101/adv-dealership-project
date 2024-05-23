package com.pluralsight;

public class SalesContract extends Contract {

    private double downPayment;
    private int termInMonths;
    private boolean finance;
    private double salesTaxAmount;
    private static final double RECORDING_FEE = 100.0;
    private double processingFee;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double downPayment, int termInMonths, boolean finance, double salesTaxAmount, double processingFee) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.downPayment = downPayment;
        this.termInMonths = termInMonths;
        this.finance = finance;
        this.salesTaxAmount = salesTaxAmount;
        this.processingFee = processingFee;
    }
}

    @Override
    public double GetTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPrice() {
        return 0;
    }
}

