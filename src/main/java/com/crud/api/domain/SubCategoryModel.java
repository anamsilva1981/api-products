package com.crud.api.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_subCategories")
public class SubCategoryModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private Long idSubCategory;

    @Column
    private String category;

}

