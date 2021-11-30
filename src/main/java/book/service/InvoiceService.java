/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.service;

import book.dto.InvoiceDto;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface InvoiceService extends Remote {
    List<InvoiceDto> search(String invoiceNo, String customerName, String productName) throws RemoteException;
}
