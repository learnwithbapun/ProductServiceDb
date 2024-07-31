package com.amex.productservicedb.serviceimpl;

import com.amex.productservicedb.exception.ProductNotFoundException;
import com.amex.productservicedb.model.Category;
import com.amex.productservicedb.model.Product;
import com.amex.productservicedb.repository.CategoryRepository;
import com.amex.productservicedb.repository.ProductRepository;
import com.amex.productservicedb.services.ProductService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component("selfProductService")
public class SelfProductService implements ProductService {


    private final CategoryRepository categoryRepository;
    private ProductRepository productRepository;


    SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    // Version -1 of the getProductById method
    public Product getProductById(Long id) throws ProductNotFoundException {

        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()){
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        return product.get();
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public Product updateProduct(Long id, Product product) {
        return null;
    }

    public Product createProduct(Product product) {
        Category category = product.getCategory();
        product.setCreatedAt(new Date());
        product.setCreatedBy("Bapun");
        product.setUpdatedAt(new Date());
        product.setUpdatedBy("Parida");

        if (category.getId() == null) {
            category.setCreatedAt(product.getCreatedAt());
            category.setCreatedBy(product.getCreatedBy());
            category.setUpdatedAt(product.getUpdatedAt());
            category.setUpdatedBy(product.getUpdatedBy());
            Category savedCategory = categoryRepository.save(category);
            product.setCategory(savedCategory);
        }
        Product savedProduct = productRepository.save(product);
        Optional<Category> optionalCategory = categoryRepository.findById(savedProduct.getCategory().getId());
        if (optionalCategory.isPresent()) {
            savedProduct.setCategory(optionalCategory.get());
        }
        return savedProduct;
    }
}
