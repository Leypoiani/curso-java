package app;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> inventory = new ArrayList<>();

        System.out.println("Enter directory: ");
        String x = sc.nextLine();

        File sourceFile = new File(x);
        String sourceFolder = sourceFile.getParent();

        boolean sucess = new File(sourceFolder + "//out").mkdir();

        String targetFile = sourceFolder + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(x))){
            String line = br.readLine();
            while (line!= null){
                String[] items = line.split(",");
                String name = items[0];
                Float value = Float.parseFloat(items[1]);
                Integer quantity = Integer.parseInt(items[2]);
                inventory.add(new Product(name, value, quantity));
                line = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for (Product item : inventory ) {
                    bw.write(item.getName()+ ","+String.format("%.2f",item.inventoryValue()));
                }
                System.out.println("File CREATED!");
            }catch(IOException e) {
                System.out.println("Error: " + e);
            }
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
