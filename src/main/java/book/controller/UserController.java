/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.controller;

import book.app.ClientApp;
import book.dto.UserLoginDto;
import book.service.UserService;

/**
 *
 * @author ADMIN
 */
public class UserController {
    public UserLoginDto login(String username, String password) {
        UserLoginDto user = new UserLoginDto();
        try {
            UserService userService = ClientApp.getUserService();
            user = userService.login(username, password);
            if (user != null) {
              System.out.println("Login: " + user.toString());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public boolean forget(String username, String password) {
        try {
            UserService userService = ClientApp.getUserService();
            boolean result = userService.forget(username, password);
            System.out.println("Reset pass: " + result);
            return result;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
