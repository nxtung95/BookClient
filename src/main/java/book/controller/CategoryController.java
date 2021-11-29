/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.controller;

import book.app.ClientApp;
import book.dto.CategoryDto;
import book.dto.ProductDto;
import book.service.CategoryService;
import book.service.ProductService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CategoryController {
    public List<CategoryDto> findAll() {
        try {
            CategoryService categoryService = ClientApp.getCategoryService();
            List<CategoryDto> categorys = categoryService.findAll();
            System.out.println("Category list, size : " + categorys.size());
            return categorys;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
