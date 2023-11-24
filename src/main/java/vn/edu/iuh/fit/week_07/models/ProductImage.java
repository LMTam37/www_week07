package vn.edu.iuh.fit.week_07.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_image")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "path")
    private String path;

    @Column(name = "alternative")
    private String alternative;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}