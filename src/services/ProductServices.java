package services;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductServices {
    List<Product> findAll() throws ClassNotFoundException, SQLException;
    void save (Product product) throws ClassNotFoundException, SQLException;
    Product findById (int id) throws ClassNotFoundException, SQLException;
    void update (int id, Product product) throws ClassNotFoundException, SQLException;
    void delete (int id) throws ClassNotFoundException, SQLException;

}
