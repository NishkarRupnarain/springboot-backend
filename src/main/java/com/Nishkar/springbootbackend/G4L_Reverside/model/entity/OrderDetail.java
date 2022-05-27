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
@Entity(name = OrderDetail.ENTITY_NAME)
@Table(name = OrderDetail.TABLE_NAME, indexes = {
        @Index(name = "payment_id_order_details_idx", columnList = "payment_id"),
        @Index(name = "user_id_idx", columnList = "user_id")
})
public class OrderDetail implements Serializable {
    public static final String ENTITY_NAME = "OrderDetail";
    public static final String TABLE_NAME = "order_details";
    public static final String COLUMN_ID_NAME = "idorder_details";
    public static final String COLUMN_TOTAL_NAME = "total";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = 4479127586961748513L;


    private Integer id;

    private User user;

    private BigDecimal total;

    private PaymentDetail payment;

    private Instant createdAt;

    private Instant updatedAt;

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

    @Column(name = COLUMN_TOTAL_NAME, precision = 10)
    public BigDecimal getTotal() {
        return total;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    public PaymentDetail getPayment() {
        return payment;
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