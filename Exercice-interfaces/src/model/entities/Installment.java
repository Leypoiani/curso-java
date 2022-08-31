package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date dueDate;
    public Double value;

    public Installment(Double value, Date dueDate) {
        this.dueDate = dueDate;
        this.value = this.value;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return sdf.format(dueDate)
                + " - "
                + String.format("%.2f", value);
    }
}
