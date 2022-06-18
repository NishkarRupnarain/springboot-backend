package com.Nishkar.springbootbackend.G4L_Reverside.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = UserAddress.ENTITY_NAME)
@Table(name = UserAddress.TABLE_NAME, indexes = {
        @Index(name = "user_id_idx", columnList = "user_id")
})
public class UserAddress implements Serializable {
    public static final String ENTITY_NAME = "UserAddress";
    public static final String TABLE_NAME = "user_address";

    public static final String COLUMN_ID_NAME = "iduser_address";
    public static final String COLUMN_ADDRESSLINE1_NAME = "address_line_1";
    public static final String COLUMN_ADDRESSLINE2_NAME = "address_line_2";
    public static final String COLUMN_ADDRESSLINE3_NAME = "address_line_3";
    public static final String COLUMN_CITY_NAME = "city";
    public static final String COLUMN_POSTALCODE_NAME = "postal_code";
    public static final String COLUMN_COUNTRY_NAME = "country";

    private static final long serialVersionUID = 5844776974455263634L;


    private Integer id;

    private User user;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String city;

    private String postalCode;

    private String country;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    public User getUser() {
        return user;
    }

    @Column(name = COLUMN_ADDRESSLINE1_NAME, length = 45)
    public String getAddressLine1() {
        return addressLine1;
    }

    @Column(name = COLUMN_ADDRESSLINE2_NAME, length = 45)
    public String getAddressLine2() {
        return addressLine2;
    }

    @Column(name = COLUMN_ADDRESSLINE3_NAME, length = 45)
    public String getAddressLine3() {
        return addressLine3;
    }

    @Column(name = COLUMN_CITY_NAME, length = 45)
    public String getCity() {
        return city;
    }

    @Column(name = COLUMN_POSTALCODE_NAME, length = 6)
    public String getPostalCode() {
        return postalCode;
    }

    @Column(name = COLUMN_COUNTRY_NAME, length = 45)
    public String getCountry() {
        return country;
    }

}