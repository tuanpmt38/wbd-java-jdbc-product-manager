package services;

import model.Product;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServicesIplm implements ProductServices {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306/product_manager";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "root";

    public ProductServicesIplm() {
    }
    public static Connection connection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;

    }

    @Override
    public List<Product> findAll() throws ClassNotFoundException, SQLException {
        List<Product> products = new ArrayList<>();

        Connection conn = connection();
        PreparedStatement stmt = null;
        String sql = "SELECT `id`,`name`,`code`,`price`,`category_id` FROM `products`";
        stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setCode(rs.getString("code"));
            product.setPrice(rs.getDouble("price"));
            product.setCategory_id(rs.getInt("category_id"));
            products.add(product);

        }
        stmt.cancel();
        conn.close();
        return products;
    }

    @Override
    public void save(Product product) throws ClassNotFoundException, SQLException  {
        Connection connection = connection();
        PreparedStatement statement = null;

        String sql;
        sql = "INSERT INTO products(`name`, `code`, `price`, `category_id`) VALUES (?, ?, ?, ?)";

        statement = connection.prepareStatement(sql);
        statement.setString(1, product.getName());
        statement.setString(2, product.getCode());

        statement.setDouble(3, product.getPrice());
        statement.setInt(4, product.getCategory_id());

        int resultSet = statement.executeUpdate();
        System.out.println("it's work?" + resultSet);

        statement.close();
        connection.close();
    }

    @Override
    public Product findById(int id) throws ClassNotFoundException, SQLException {
        PreparedStatement statement = null;
        Connection connection = connection();

        String sql;
        sql = "SELECT `id`, `name`, `code`, `price`, `category_id`  FROM products WHERE `id` = ?";

        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        Product products = new Product();
        while (resultSet.next()) {
            products.setId(resultSet.getInt("id"));
            products.setName(resultSet.getString("name"));
            products.setCode(resultSet.getString("code"));
            products.setPrice(resultSet.getDouble("price"));
            products.setCategory_id(resultSet.getInt("category_id"));
        }
        resultSet.close();
        statement.close();
        connection.close();

        return products;
    }

    @Override
    public void update(int id, Product products) throws ClassNotFoundException, SQLException {
        PreparedStatement statement = null;
        Connection connection = connection();

        String sql;
        sql = "UPDATE products SET `name` = ?, `code` = ?, `price` = ?, `category_id` = ? WHERE `id` = ?";

        statement = connection.prepareStatement(sql);
        statement.setString(1, products.getName());
        statement.setString(2, products.getCode());
        statement.setDouble(3, products.getPrice());
        statement.setInt(4, products.getCategory_id());
        statement.setInt(5, id);

        int resultSet = statement.executeUpdate();
        System.out.println("update ok" + resultSet);

        statement.close();
        connection.close();
    }

    @Override
    public void delete(int id) throws ClassNotFoundException, SQLException {
        Connection connection = connection();
        PreparedStatement statement = null;

        String sql;
        sql = "DELETE FROM products WHERE id = ?";

        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        int resultSet = statement.executeUpdate();
        System.out.println("it's work" + resultSet);

        statement.close();
        connection.close();

    }
}
