/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.controller;

import book.app.ClientApp;
import book.dto.ProductDto;
import book.service.ProductService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ProductController {
    public List<ProductDto> search(String productId, String productName, int categoryId, String supplierName) {
        try {
            ProductService productService = ClientApp.getProductService();
            List<ProductDto> products = productService.search(productId, productName, categoryId, supplierName);
            System.out.println("Product list, size : " + products.size());
            return products;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(String productName, String productId, int categoryId, String price, String supplier, String image, int totalPage, String author, String publisher) {
        boolean result = false;
        try {
            ProductService productService = ClientApp.getProductService();
            result = productService.add(productName, productId, categoryId, price, supplier, image, totalPage, author, publisher);
            System.out.println("Add Product, size : " + result);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
