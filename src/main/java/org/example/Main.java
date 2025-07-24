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
//
//        List<product> products = service.getproducts();
//        for(product p : products )
//        {
//            System.out.println(p);
//        }

          service.getproducts();

//
//        System.out.println("===============================================================");
//        System.out.println(service.getproduct("samsung"));
//
//        System.out.println("=================================================================");
//        List<product> p1 = service.searchproducts("lenovo");
//        for(product p : p1)
//        {
//            System.out.println(p);
//        }
//
//        System.out.println("===================================================================");
//
//        List<product>  p2 = service.getExpiredProducts(2024);
//        for(product p : p2)
//        {
//            System.out.println(p);
//        }



    }
}