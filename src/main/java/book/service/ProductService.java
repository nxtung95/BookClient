/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.service;

import book.dto.ProductDto;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ProductService extends Remote {
    List<ProductDto> search(String productId, String productName, int categoryId, String supplierName) throws RemoteException;
    
    boolean add(String productName, String productId, int categoryId, String price, String supplier, String image, int totalPage, String author, String publisher) throws RemoteException;

    boolean update(Integer id, String productName, String productId, int categoryId, String price, String supplier, String image, int totalPage, String author, String publisher) throws RemoteException;

    boolean remove(Integer parseInt) throws RemoteException;;
}
