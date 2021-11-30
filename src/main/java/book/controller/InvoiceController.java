/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.controller;

import book.app.ClientApp;
import book.dto.InvoiceDto;
import book.service.InvoiceService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class InvoiceController {
    public List<InvoiceDto> search(String invoiceNo, String customerName, String productName) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        try {
            InvoiceService invoiceService = ClientApp.getInvoiceService();
            invoiceDtos = invoiceService.search(invoiceNo, customerName, productName);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return invoiceDtos;
    }
}
