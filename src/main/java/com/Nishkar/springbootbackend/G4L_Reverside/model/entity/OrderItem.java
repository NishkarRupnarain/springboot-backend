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
@Entity(name = OrderItem.ENTITY_NAME)
@Table(name = OrderItem.TABLE_NAME, indexes = {
        @Index(name = "product_id_idx", columnList = "product_id"),
        @Index(name = "order_id_idx", columnList = "order_id")
})
public class OrderItem implements Serializable {
    public static final String ENTITY_NAME = "OrderItem";
    public static final String TABLE_NAME = "order_items";
    public static final String COLUMN_ID_NAME = "idorder_items";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = -719959817899283834L;


    private Integer id;

    private OrderDetail order;

    private Product product;

    private Instant createdAt;

    private Instant updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    public OrderDetail getOrder() {
        return order;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    public Product getProduct() {
        return product;
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