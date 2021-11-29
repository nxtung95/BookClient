/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ADMIN
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String address;
    private String role;
    private String staffIf;

    @Override
    public String toString() {
        return "UserLoginDto{" + "name=" + name + ", address=" + address + ", role=" + role + ", staffIf=" + staffIf + '}';
    }
}
