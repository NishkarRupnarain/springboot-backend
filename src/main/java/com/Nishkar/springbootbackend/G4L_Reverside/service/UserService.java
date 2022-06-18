package com.Nishkar.springbootbackend.G4L_Reverside.service;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.User;
import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.UserDTO.UserDto;
import com.Nishkar.springbootbackend.G4L_Reverside.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsersAddress() {
        return userRepository.findAll()
                .stream()
                .map(this::convertUserEntityToDto)
                .collect(Collectors.toUnmodifiableList());

    }

    private UserDto convertUserEntityToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setIdNumber(user.getIdNumber());
        userDto.setEmail(user.getEmail());
        userDto.setUsername(user.getUsername());
        userDto.setMobileNumber(user.getMobileNumber());
        userDto.setPassword(user.getPassword());
        userDto.setAddressId(user.getAddress().getId());
        userDto.setAddressAddressLine1(user.getAddress().getAddressLine1());
        userDto.setAddressAddressLine2(user.getAddress().getAddressLine2());
        userDto.setAddressAddressLine3(user.getAddress().getAddressLine3());
        userDto.setAddressCity(user.getAddress().getCity());
        userDto.setAddressPostalCode(user.getAddress().getPostalCode());
        userDto.setAddressCountry(user.getAddress().getCountry());
        userDto.setCreatedAt(Instant.now());
        userDto.setUpdatedAt(Instant.now());
        return userDto;
    }
}
/*    private Integer id;
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
    private Integer admin;*/