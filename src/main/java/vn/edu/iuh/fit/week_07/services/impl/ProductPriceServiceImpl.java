package vn.edu.iuh.fit.week_07.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week_07.models.ProductPrice;
import vn.edu.iuh.fit.week_07.repositories.ProductPriceRepository;
import vn.edu.iuh.fit.week_07.services.ProductPriceService;

import java.util.List;

@Service
class ProductPriceServiceImpl implements ProductPriceService {

    @Autowired
    private ProductPriceRepository productPriceRepository;

    @Override
    public List<ProductPrice> getAllProductPrices() {
        return productPriceRepository.findAll();
    }

    @Override
    public ProductPrice getProductPriceById(Long priceId) {
        return productPriceRepository.findById(priceId)
                .orElseThrow(() -> new EntityNotFoundException("ProductPrice not found with id: " + priceId));
    }

    @Override
    public ProductPrice createProductPrice(ProductPrice productPrice) {
        return productPriceRepository.save(productPrice);
    }

    @Override
    public ProductPrice updateProductPrice(Long priceId, ProductPrice productPrice) {
        if (!productPriceRepository.existsById(priceId)) {
            throw new EntityNotFoundException("ProductPrice not found with id: " + priceId);
        }
        productPrice.setPriceId(priceId);
        return productPriceRepository.save(productPrice);
    }

    @Override
    public void deleteProductPrice(Long priceId) {
        if (!productPriceRepository.existsById(priceId)) {
            throw new EntityNotFoundException("ProductPrice not found with id: " + priceId);
        }
        productPriceRepository.deleteById(priceId);
    }
}