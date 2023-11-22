package com.crud.api.domain;

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
    private Long id;

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
    private String rating;

    @Column
    private BigDecimal price;

    @Column
    private String image;

    @Column
    private String category;

    @Column
    private String subCategory;




}
