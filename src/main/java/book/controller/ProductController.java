/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.controller;

import book.app.ClientApp;
import book.dto.ProductDto;
import book.service.ProductService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public boolean update(Integer id, String productName, String productId, int categoryId, String price, String supplier, String image, int totalPage, String author, String publisher) {
        boolean result = false;
        try {
            ProductService productService = ClientApp.getProductService();
            result = productService.update(id, productName, productId, categoryId, price, supplier, image, totalPage, author, publisher);
            System.out.println("Add Product, size : " + result);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(int parseInt) {
        try {
            ProductService productService = ClientApp.getProductService();
            return productService.remove(parseInt);
        } catch (Exception ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
