package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.ProductImage;

import java.util.List;

public interface ProductImageService {
    List<ProductImage> getAllProductImages();

    ProductImage getProductImageById(Long imageId);

    ProductImage createProductImage(ProductImage productImage);

    ProductImage updateProductImage(Long imageId, ProductImage productImage);

    void deleteProductImage(Long imageId);
}