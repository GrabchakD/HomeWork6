package com.dgrabchak.jdbc;

import com.dgrabchak.jdbc.model.Camera;
import com.dgrabchak.jdbc.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1L, "IPhone", 999.99);
        Product product2 = new Product(2L, "Samsung", 899.99);

        Camera camera1 = new Camera(1L, "Sony", 500.00, 100);
        Camera camera2 = new Camera(2L, "Canon", 600.00, 200);

        System.out.println(product1.compareTo(camera1));

    }
}
