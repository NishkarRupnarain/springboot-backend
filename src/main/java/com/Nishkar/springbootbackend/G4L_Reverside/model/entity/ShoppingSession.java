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
@Entity(name = ShoppingSession.ENTITY_NAME)
@Table(name = ShoppingSession.TABLE_NAME, indexes = {
        @Index(name = "user_id_idx", columnList = "user_id")
})
public class ShoppingSession implements Serializable {
    public static final String ENTITY_NAME = "ShoppingSession";
    public static final String TABLE_NAME = "shopping_session";
    public static final String COLUMN_ID_NAME = "idshopping_session";
    public static final String COLUMN_TOTAL_NAME = "total";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = -5916817286648731438L;


    private Integer id;

    private User user;

    private BigDecimal total;

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

    @Column(name = COLUMN_CREATEDAT_NAME)
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Column(name = COLUMN_UPDATEDAT_NAME)
    public Instant getUpdatedAt() {
        return updatedAt;
    }

}