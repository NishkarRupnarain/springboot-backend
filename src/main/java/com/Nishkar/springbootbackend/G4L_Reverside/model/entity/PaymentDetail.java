package com.Nishkar.springbootbackend.G4L_Reverside.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = PaymentDetail.ENTITY_NAME)
@Table(name = PaymentDetail.TABLE_NAME, indexes = {
        @Index(name = "order_id_UNIQUE", columnList = "order_id", unique = true)
})
public class PaymentDetail implements Serializable {
    public static final String ENTITY_NAME = "PaymentDetail";
    public static final String TABLE_NAME = "payment_details";
    public static final String COLUMN_ID_NAME = "idpayment_details";
    public static final String COLUMN_AMOUNT_NAME = "amount";
    public static final String COLUMN_PROVIDER_NAME = "provider";
    public static final String COLUMN_STATUS_NAME = "status";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = -7364195140224061001L;


    private Integer id;

    private OrderDetail order;

    private BigDecimal amount;

    private String provider;

    private String status;

    private Instant createdAt;

    private Instant updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    public OrderDetail getOrder() {
        return order;
    }

    @Column(name = COLUMN_AMOUNT_NAME, precision = 10)
    public BigDecimal getAmount() {
        return amount;
    }

    @Column(name = COLUMN_PROVIDER_NAME, length = 45)
    public String getProvider() {
        return provider;
    }

    @Column(name = COLUMN_STATUS_NAME, length = 45)
    public String getStatus() {
        return status;
    }

    @Column(name = COLUMN_CREATEDAT_NAME)
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Column(name = COLUMN_UPDATEDAT_NAME)
    public Instant getUpdatedAt() {
        return updatedAt;
    }

}