package com.Nishkar.springbootbackend.G4L_Reverside.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = User.ENTITY_NAME)
@Table(name = User.TABLE_NAME, indexes = {
        @Index(name = "email_UNIQUE", columnList = "email", unique = true),
        @Index(name = "id_number_UNIQUE", columnList = "id_number", unique = true),
        @Index(name = "username_UNIQUE", columnList = "username", unique = true),
        @Index(name = "address_id_idx", columnList = "address_id")
})
public class User implements Serializable {
    public static final String ENTITY_NAME = "User";
    public static final String TABLE_NAME = "user";
    public static final String COLUMN_ID_NAME = "iduser";
    public static final String COLUMN_FIRSTNAME_NAME = "first_name";
    public static final String COLUMN_LASTNAME_NAME = "last_name";
    public static final String COLUMN_IDNUMBER_NAME = "id_number";
    public static final String COLUMN_EMAIL_NAME = "email";
    public static final String COLUMN_USERNAME_NAME = "username";
    public static final String COLUMN_MOBILENUMBER_NAME = "mobile_number";
    public static final String COLUMN_PASSWORD_NAME = "password";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    public static final String COLUMN_ADMIN_NAME = "admin";
    private static final long serialVersionUID = 7831982150840759337L;


    private Integer id;

    private String firstName;

    private String lastName;

    private String idNumber;

    private String email;

    private String username;

    private String mobileNumber;

    private String password;

    private UserAddress address;

    private Instant createdAt;

    private Instant updatedAt;

    private Integer admin;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = COLUMN_FIRSTNAME_NAME, length = 45)
    public String getFirstName() {
        return firstName;
    }

    @Column(name = COLUMN_LASTNAME_NAME, length = 45)
    public String getLastName() {
        return lastName;
    }

    @Column(name = COLUMN_IDNUMBER_NAME, nullable = false, length = 45)
    public String getIdNumber() {
        return idNumber;
    }

    @Column(name = COLUMN_EMAIL_NAME, nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    @Column(name = COLUMN_USERNAME_NAME, length = 45)
    public String getUsername() {
        return username;
    }

    @Column(name = COLUMN_MOBILENUMBER_NAME, length = 13)
    public String getMobileNumber() {
        return mobileNumber;
    }

    @Column(name = COLUMN_PASSWORD_NAME, nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    public UserAddress getAddress() {
        return address;
    }

    @Column(name = COLUMN_CREATEDAT_NAME)
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Column(name = COLUMN_UPDATEDAT_NAME)
    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @Column(name = COLUMN_ADMIN_NAME)
    public Integer getAdmin() {
        return admin;
    }

}