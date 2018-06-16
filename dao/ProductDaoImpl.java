package com.dgrabchak.jdbc.dao;

import com.dgrabchak.jdbc.model.Product;

import java.sql.*;

public class ProductDaoImpl extends AbstractDao<Product, Long>  implements ProductDao {

    public ProductDaoImpl(Connection connection) {
        super(connection);
    }

    public void saveProduct(Product product) throws SQLException {

        String query = "INSERT INTO PRODUCTS (NAME, PRICE) VALUES (?, ?)";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, product.getName());
        statement.setDouble(2, product.getPrice());
        statement.execute();
    }

    public Product getById(Long id) throws SQLException {
        String query = "SELECT ID, NAME, PRICE FROM PRODUCTS WHERE ID = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setLong(1, id);
        ResultSet resultSet = statement.executeQuery();

        resultSet.first();

        Long pId = resultSet.getLong(1);
        String pName = resultSet.getString(2);
        Double pPrice = resultSet.getDouble(3);
        Product product = new Product(pId, pName, pPrice);

        return product;
    }

    public void updateProduct(Product product) throws SQLException {
        String query = "UPDATE PRODUCTS SET NAME = ?, PRICE = ? WHERE ID = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, product.getName());
        statement.setDouble(2, product.getPrice());
        statement.setLong(3, product.getId());
        statement.executeUpdate();
    }

    public void deleteProduct(Long id) throws SQLException {
        String query = "DELETE FROM PRODUCTS WHERE ID = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setLong(1, id);
        statement.execute();
    }
}
