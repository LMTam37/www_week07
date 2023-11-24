package vn.edu.iuh.fit.week_07.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "product_price")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    private Long priceId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "price_date_time")
    private Date priceDateTime;

    @Column(name = "price")
    private double price;

    @Column(name = "note")
    private String note;
}