package repository;

import model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductMysqlRepositoryIplm implements ProductMysqlRepository {
//    @Override
//    public List<Product> findAll() throws SQLException, ClassNotFoundException {
//        Connection conn = ConnectionUtils.connect();
//        List<Product> products = new ArrayList<>();
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM `products`");
//        while (rs.next()){
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String code = rs.getString("code");
//            double price = rs.getDouble("price");
//            int category_id = rs.getInt("category_id");
//            Product product = new Product(id, name, code, price, category_id);
//            products.add(product);
//        }
//        conn.close();
//        return products;
//    }
}
