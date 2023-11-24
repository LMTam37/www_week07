package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Long productId);

    Product createProduct(Product product);

    Product updateProduct(Long productId, Product product);

    void deleteProduct(Long productId);

    List<Product> getAllActiveProducts();
}