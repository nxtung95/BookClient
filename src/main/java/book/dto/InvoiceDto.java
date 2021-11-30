/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author ADMIN
 */
@Data
@AllArgsConstructor
public class InvoiceDto implements Serializable {
	private static final long serialVersionUID = 5L;

	private String invoiceNo;
	private String productName;
	private String customerName;
	private Date saleDate;
	private BigDecimal quantiy;
	private BigDecimal price;
	private BigDecimal totalPrice;
}
