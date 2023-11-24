package vn.edu.iuh.fit.week_07.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.week_07.enums.ProductStatus;

import java.util.List;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit")
    private String unit;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private ProductStatus status;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;
}