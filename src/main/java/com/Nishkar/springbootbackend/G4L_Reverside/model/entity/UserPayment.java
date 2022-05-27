package com.Nishkar.springbootbackend.G4L_Reverside.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = UserPayment.ENTITY_NAME)
@Table(name = UserPayment.TABLE_NAME, indexes = {
        @Index(name = "user_id_payments_idx", columnList = "user_id")
})
public class UserPayment implements Serializable {
    public static final String ENTITY_NAME = "UserPayment";
    public static final String TABLE_NAME = "user_payment";
    public static final String COLUMN_ID_NAME = "iduser_payment";
    public static final String COLUMN_PAYMENTTYPE_NAME = "payment_type";
    public static final String COLUMN_PROVIDER_NAME = "provider";
    public static final String COLUMN_ACCOUNTNUMBER_NAME = "account_number";
    public static final String COLUMN_EXPIRY_NAME = "expiry";
    private static final long serialVersionUID = 8947583707880969209L;


    private Integer id;

    private User user;

    private String paymentType;

    private String provider;

    private String accountNumber;

    private LocalDate expiry;

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

    @Column(name = COLUMN_PAYMENTTYPE_NAME, length = 45)
    public String getPaymentType() {
        return paymentType;
    }

    @Column(name = COLUMN_PROVIDER_NAME, length = 45)
    public String getProvider() {
        return provider;
    }

    @Column(name = COLUMN_ACCOUNTNUMBER_NAME, length = 45)
    public String getAccountNumber() {
        return accountNumber;
    }

    @Column(name = COLUMN_EXPIRY_NAME)
    public LocalDate getExpiry() {
        return expiry;
    }

}