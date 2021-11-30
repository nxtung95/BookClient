/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.controller;

import book.app.ClientApp;
import book.dto.CustomerDto;
import book.service.CustomerService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CustomerController {
    public List<CustomerDto> search(String customerId, String name, String productName) {
        try {
            CustomerService customerService = ClientApp.getCustomerService();
            List<CustomerDto> customers = customerService.findAll(customerId, name, productName);
            System.out.println("Customer list, size : " + customers.size());
            return customers;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean add(String customerId, Date birthday, String name, String address) {
        try {
            CustomerService customerService = ClientApp.getCustomerService();
            boolean result = customerService.add(customerId, birthday, name, address);
            System.out.println("Add result : " + result);
            return result;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean edit(int id, String customerId, Date birthday, String name, String address) {
        try {
            CustomerService customerService = ClientApp.getCustomerService();
            boolean result = customerService.edit(id, customerId, birthday, name, address);
            System.out.println("Edit result : " + result);
            return result;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean remove(int id) {
        try {
            CustomerService customerService = ClientApp.getCustomerService();
            boolean result = customerService.remove(id);
            System.out.println("Remove result : " + result);
            return result;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
