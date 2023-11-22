package com.crud.api.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_categories")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long idCategory;

    @ManyToOne
    @JoinColumn(name = "id_subCategory")
    private SubCategoryModel subCategory;

}
