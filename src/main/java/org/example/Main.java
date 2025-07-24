package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();



//        service.addProduct(new product(1,"lenovo","laptop","cabinate",2027));
//        service.addProduct(new product(2,"asus","slimbook","safe",2027));
//        service.addProduct(new product(3,"lenovo ideapad","laptop","table",2025));
//        service.addProduct(new product(4,"lenovo thinkpad","laptop","cabinate",2024));
//        service.addProduct(new product(5,"samsung","smartphone","cabinate",2027));

          System.out.println("===========================================================");
          service.getproducts();

          System.out.println("===============================================================");
          service.getproduct(7);
    }
}