/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author ADMIN
 */
@Data
@AllArgsConstructor
public class CategoryDto implements Serializable {
    private static final long serialVersionUID = 3L;
    private int id;
    private String name;
}
