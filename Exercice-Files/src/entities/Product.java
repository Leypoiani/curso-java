package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Product {

    public String name;
    public float value;
    public int quantity;

    public Product() {
    }

    public Product(String name, float value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Float inventoryValue(){
        Float inventoryValue = getValue() * getQuantity();
        return inventoryValue;
    }

    public void inventoryFile(String[] items){
        String path = "C:\\temp\\out\\summary.csv";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line: items) {
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
