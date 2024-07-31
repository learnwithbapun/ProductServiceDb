package com.amex.productservicedb.services;


import com.amex.productservicedb.exception.ProductNotFoundException;
import com.amex.productservicedb.model.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(Long id) throws ProductNotFoundException;
    public List<Product> getAllProducts();

    public Product updateProduct(Long id,Product product);
    public Product createProduct(Product product);


}
