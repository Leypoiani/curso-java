package model.entities;

import model.services.ContractService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer contract;
    private Date dateOfContract;
    private Double totalValue;
    private ContractService paymentService;

    List <Installment> Installments = new ArrayList<Installment>();


    public Contract() {
    }

    public Contract(Integer contract, Date dateOfContract, Double totalValue) {
        this.contract = contract;
        this.dateOfContract = dateOfContract;
        this.totalValue = totalValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Integer getContract() {
        return contract;
    }

    public void setContract(Integer contract) {
        this.contract = contract;
    }

    public Date getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(Date dateOfContract) {
        this.dateOfContract = dateOfContract;
    }


    public ContractService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(ContractService paymentService) {
        this.paymentService = paymentService;
    }

    public List<Installment> getInstallments() {
        return Installments;
    }
}
