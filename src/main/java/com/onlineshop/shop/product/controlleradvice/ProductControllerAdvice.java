package com.onlineshop.shop.product.controlleradvice;

import com.onlineshop.shop.product.dtos.ProductResponseSelf;
import com.onlineshop.shop.product.exceptions.ProductNotPresentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductControllerAdvice {
    @ExceptionHandler(ProductNotPresentException.class)
    public ResponseEntity<ProductResponseSelf> handleInvalidProduct(){
        ProductResponseSelf productResponseSelf = new ProductResponseSelf(null,
                "Product Doesn't exist from contorller advice ");
        return new ResponseEntity<>(
                productResponseSelf, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ProductResponseSelf> handleArithmaticException(){
        ProductResponseSelf productResponseSelf = new ProductResponseSelf(null,
                "Something went wrong from contorller advice ");
        return new ResponseEntity<>(
                productResponseSelf, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
