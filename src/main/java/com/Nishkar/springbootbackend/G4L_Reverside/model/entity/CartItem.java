package com.Nishkar.springbootbackend.G4L_Reverside.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = CartItem.ENTITY_NAME)
@Table(name = CartItem.TABLE_NAME, indexes = {
        @Index(name = "product_id_idx", columnList = "product_id"),
        @Index(name = "session_id_idx", columnList = "session_id")
})
public class CartItem implements Serializable {
    public static final String ENTITY_NAME = "CartItem";
    public static final String TABLE_NAME = "cart_items";
    public static final String COLUMN_ID_NAME = "idcart_items";
    public static final String COLUMN_QUANTITY_NAME = "quantity";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = -5007301567911168340L;


    private Integer id;

    private ShoppingSession session;

    private Product product;

    private Integer quantity;

    private Instant createdAt;

    private Instant updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "session_id", nullable = false)
    public ShoppingSession getSession() {
        return session;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    public Product getProduct() {
        return product;
    }

    @Column(name = COLUMN_QUANTITY_NAME)
    public Integer getQuantity() {
        return quantity;
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