/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.service;

import book.dto.UserLoginDto;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ADMIN
 */
public interface UserService extends Remote {
    UserLoginDto login(String username, String password) throws RemoteException;
    boolean forget(String username, String newPassword) throws RemoteException;
}
