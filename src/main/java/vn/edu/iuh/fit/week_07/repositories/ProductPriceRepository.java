package vn.edu.iuh.fit.week_07.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.week_07.models.ProductPrice;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
    List<ProductPrice> findAllByProduct_ProductId(Long productId);

    Optional<ProductPrice> findTopByProduct_ProductIdOrderByPriceDateTimeDesc(Long productId);
}