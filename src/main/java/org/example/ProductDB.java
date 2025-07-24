package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection con = null;

    public ProductDB()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_tracker","root","2202901540041@#");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void save(product p){
         String query = "insert into product (name,type,place,expiry_date) values(?,?,?,?)";

        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getExpiry());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<product> fetchAll() {
        List<product> products = new ArrayList<>();
        String query = "select * from product";

        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {   product p = new product();

                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPlace(rs.getString(4));
                p.setExpiry(rs.getInt(5));
                products.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
