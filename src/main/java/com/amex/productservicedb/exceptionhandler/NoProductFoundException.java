package com.amex.productservicedb.exceptionhandler;

public class NoProductFoundException {
    String message;
    public NoProductFoundException(String message) {
        this.message = message;
    }
}
