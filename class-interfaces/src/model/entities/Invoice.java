package model.entities;

public class Invoice {
    private Double basicpayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicpayment, Double tax) {
        this.basicpayment = basicpayment;
        this.tax = tax;
    }

    public Double getBasicpayment() {
        return basicpayment;
    }

    public void setBasicpayment(Double basicpayment) {
        this.basicpayment = basicpayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotalPayment(){
        return getBasicpayment() + getTax();
    }
}
