package com.dgrabchak.jdbc;

import com.dgrabchak.jdbc.dao.ProductDaoImpl;
import com.dgrabchak.jdbc.model.Product;

import java.sql.SQLException;
import java.util.Scanner;

public class SimpleJDBC {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        ProductDaoImpl dao = Factory.getProductDao();

        //Product product = new Product("SAMSUNG", 700.99);
        //Product product2 = new Product(3L,"iPhone X", 1000.10);

        //dao.saveProduct(product);
        //dao.updateProduct(product2);
        //Product p = dao.getById(3L);
        //System.out.println(p);
        //dao.deleteProduct(5L);

        /*while (true) {
            System.out.println("Chose number");
            System.out.println("1 = Add new element to table");
            System.out.println("2 = Get element by id");
            System.out.println("3 = Remove element from table");
            System.out.println("4 = Update product");

            int input = sc.nextInt();
            long id = sc.nextLong();
            String name = sc.nextLine();
            double price = sc.nextDouble();


            if (input == 1) {
                Product product = new Product(name, price);
                dao.saveProduct(product);
            } else if (input == 2) {
                dao.getById(id);
            } else if (input == 3) {
                dao.deleteProduct(id);
            } else if (input == 4) {
                Product product = new Product(id, name, price);
                dao.updateProduct(product);
            } else {
                System.out.println("Please input number from 1 to 4");
            }
        }*/
    }
}
