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
@Entity(name = ProductInventory.ENTITY_NAME)
@Table(name = ProductInventory.TABLE_NAME)
public class ProductInventory implements Serializable {
    public static final String ENTITY_NAME = "ProductInventory";
    public static final String TABLE_NAME = "product_inventory";
    public static final String COLUMN_ID_NAME = "idproduct_inventory";
    public static final String COLUMN_QUANTITY_NAME = "quantity";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = -3976185000858355815L;


    private Integer id;

    private Long quantity;

    private Instant createdAt;

    private Instant updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = COLUMN_QUANTITY_NAME)
    public Long getQuantity() {
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