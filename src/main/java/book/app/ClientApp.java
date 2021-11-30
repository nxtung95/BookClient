/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.app;

import book.service.CategoryService;
import book.service.CustomerService;
import book.service.ProductService;
import book.service.UserService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author ADMIN
 */
public class ClientApp {
        private static final int PORT = 1099;
    private static final String HOST = "127.0.0.1";
    
    public static UserService userService;
    public static ProductService productService;
    public static CategoryService categoryService;
    public static CustomerService customerService;
    
    static {
        try {
            System.out.println("Start lookung service from registry...");
            userService = (UserService) Naming.lookup("rmi://" + HOST + ":" + PORT + "/userService");
            productService = (ProductService) Naming.lookup("rmi://" + HOST + ":" + PORT + "/productService");
            categoryService = (CategoryService) Naming.lookup("rmi://" + HOST + ":" + PORT + "/categoryService");
            customerService = (CustomerService) Naming.lookup("rmi://" + HOST + ":" + PORT + "/customerService");
            System.out.println("Looking for service from registry success...");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static UserService getUserService() throws NotBoundException, MalformedURLException, RemoteException {
        if (userService != null) {
            return userService;
        }
        return null;
    }
    
    public static ProductService getProductService() throws NotBoundException, MalformedURLException, RemoteException {
        if (productService != null) {
            return productService;
        }
        return null;
    }
   
    public static CategoryService getCategoryService() throws NotBoundException, MalformedURLException, RemoteException {
        if (categoryService != null) {
            return categoryService;
        }
        return null;
    }
    
    public static CustomerService getCustomerService() throws NotBoundException, MalformedURLException, RemoteException {
        if (customerService != null) {
            return customerService;
        }
        return null;
    }
}
