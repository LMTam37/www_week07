package vn.edu.iuh.fit.week_07.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week_07.models.ProductImage;
import vn.edu.iuh.fit.week_07.repositories.ProductImageRepository;
import vn.edu.iuh.fit.week_07.services.ProductImageService;

import java.util.List;

@Service
public class ProductImageServiceImpl implements ProductImageService {

    @Autowired
    private ProductImageRepository productImageRepository;

    @Override
    public List<ProductImage> getAllProductImages() {
        return productImageRepository.findAll();
    }

    @Override
    public ProductImage getProductImageById(Long imageId) {
        return productImageRepository.findById(imageId)
                .orElseThrow(() -> new EntityNotFoundException("ProductImage not found with id: " + imageId));
    }

    @Override
    public ProductImage createProductImage(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    @Override
    public ProductImage updateProductImage(Long imageId, ProductImage productImage) {
        if (!productImageRepository.existsById(imageId)) {
            throw new EntityNotFoundException("ProductImage not found with id: " + imageId);
        }
        productImage.setImageId(imageId);
        return productImageRepository.save(productImage);
    }

    @Override
    public void deleteProductImage(Long imageId) {
        if (!productImageRepository.existsById(imageId)) {
            throw new EntityNotFoundException("ProductImage not found with id: " + imageId);
        }
        productImageRepository.deleteById(imageId);
    }
}