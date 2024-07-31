package com.amex.productservicedb.exception;

public class ProductNotFoundException extends Exception {

   private  Long id;
    private String message;
    public ProductNotFoundException(String message) {
        super(message);
    }
}