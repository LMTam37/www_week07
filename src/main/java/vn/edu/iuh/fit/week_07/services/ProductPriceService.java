package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.ProductPrice;

import java.util.List;

public interface ProductPriceService {
    List<ProductPrice> getAllProductPrices();

    ProductPrice getProductPriceById(Long priceId);

    ProductPrice createProductPrice(ProductPrice productPrice);

    ProductPrice updateProductPrice(Long priceId, ProductPrice productPrice);

    void deleteProductPrice(Long priceId);
}