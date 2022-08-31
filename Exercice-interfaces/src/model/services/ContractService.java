package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    public OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 0; i < months; i++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota +onlinePaymentService.paymentFee(updatedQuota);
            Date dueDate = addMonths(contract.getDateOfContract(), i);
            contract.getInstallments().add(new Installment(fullQuota, dueDate));
        }
    }
    public Date addMonths(Date date, int months){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, months);
        return calendar.getTime();
    }

    public Double calculateInstallments(Contract contract, int N) {


    return null;
    }

}
