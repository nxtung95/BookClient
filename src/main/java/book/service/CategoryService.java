/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.service;

import book.dto.CategoryDto;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface CategoryService extends Remote {
    List<CategoryDto> findAll() throws RemoteException;
}
