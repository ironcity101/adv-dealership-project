package com.pluralsight;

public abstract class Contract {
    String DateOfContract;
    String CustomerName;
    String CustomerEmail;
    String VehicleSold;
    Double TotalPrice;
    Double MonthlyPayment;

    public Contract(String dateOfContract, String customerName, String customerEmail, String vehicleSold) {
        DateOfContract = dateOfContract;
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        VehicleSold = vehicleSold;    }

    public String getDateOfContract() {
        return DateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        DateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getVehicleSold() {
        return VehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        VehicleSold = vehicleSold;
    }

    public abstract double GetTotalPrice();

    public abstract double getMonthlyPrice();
}
