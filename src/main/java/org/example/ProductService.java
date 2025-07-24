package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    ProductDB db = new ProductDB();
    List<product> products = new ArrayList<>();

    public void addProduct(product p) {
        db.save(p);
    }

    public void getproducts()
    {
        List<product> products = new ArrayList<>();
        products = db.fetchAll();
        for(product p :products)  System.out.println(p);
    }


    public product getproduct(int id) {

        System.out.println(db.fetchOne(id));
        return null;
    }

    public List<product> searchproducts(String text) {

        String str = text.toLowerCase();
        List<product> pr = new ArrayList<>();

        for(product p : products)
        {
            String name = p.getName().toLowerCase();
            String place = p.getPlace().toLowerCase();
            String type = p.getType().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
            {
                 pr.add(p);
            }
        }
        return pr;
    }

//    public List<product> searchproducts(String text) {
//        String str = text.toLowerCase();
//
//        return products.stream()
//                .filter(p -> p.getName().toLowerCase().contains(str)
//                        || p.getPlace().toLowerCase().contains(str)
//                        || p.getType().toLowerCase().contains(str))
//                .collect(Collectors.toList());
//    }


    public List<product> getExpiredProducts(int number) {
        List<product> prod = new ArrayList<>();
        for(product p : products)
        {
            if(p.getExpiry() <= number)
                prod.add(p);

        }
        return prod;
    }
}
