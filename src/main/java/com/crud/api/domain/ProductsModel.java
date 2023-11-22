package com.crud.api.domain;

import com.crud.api.cross.Rating;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_products")
public class ProductsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_products;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Integer sku;

    @Column
    @Temporal(TemporalType.DATE)
    // Tipo Grande decimal
    private Date date = new java.sql.Date((System.currentTimeMillis()));

    @Column
    private Integer stock;

    @Column
    private Boolean status;

    @Column
    private Rating rating;

    @Column
    private BigDecimal price;

    @Column
    private String image;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryModel category;

    @Column
    private String subCategory;




}
