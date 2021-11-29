/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ADMIN
 */
@Getter
@Setter
@AllArgsConstructor
public class ProductDto implements Serializable {
    private static final long serialVersionUID = 2L;

    private String productId;
    private String categoryName;
    private String productName;
    private int quantity;
    private BigDecimal price;
    private String supplier;
    private String image;
    private String author;
    private int totalPage;
    private String publisher;
}
