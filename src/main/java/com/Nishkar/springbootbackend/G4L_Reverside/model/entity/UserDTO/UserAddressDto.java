package com.Nishkar.springbootbackend.G4L_Reverside.model.entity.UserDTO;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressDto implements Serializable {
    private static final long serialVersionUID = -4891458414629225649L;
    private Integer id;
    private User user;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String postalCode;
    private String country;
}
