package vn.edu.iuh.fit.week_07.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.week_07.enums.ProductStatus;
import vn.edu.iuh.fit.week_07.models.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByStatus(ProductStatus productStatus);
}