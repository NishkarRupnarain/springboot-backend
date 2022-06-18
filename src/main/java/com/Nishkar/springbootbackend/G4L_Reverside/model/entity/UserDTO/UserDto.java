package com.Nishkar.springbootbackend.G4L_Reverside.model.entity.UserDTO;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = -5899758438796381106L;
    private Integer id;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String email;
    private String username;
    private String mobileNumber;
    private String password;
    private Integer addressId;
    private String addressAddressLine1;
    private String addressAddressLine2;
    private String addressAddressLine3;
    private String addressCity;
    private String addressPostalCode;
    private String addressCountry;
    private Instant createdAt;
    private Instant updatedAt;
    private Integer admin;
}
