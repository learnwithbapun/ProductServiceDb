package com.amex.productservicedb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {

    private String title;

    @OneToMany(fetch = FetchType.LAZY)
    List<Product> productList;
}
