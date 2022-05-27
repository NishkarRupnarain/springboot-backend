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
@Entity(name = Product.ENTITY_NAME)
@Table(name = Product.TABLE_NAME, indexes = {
        @Index(name = "catergory_id_idx", columnList = "catergory_id"),
        @Index(name = "inventory_id_idx", columnList = "inventory_id"),
        @Index(name = "discount_id_idx", columnList = "discount_id"),
        @Index(name = "SKU_UNIQUE", columnList = "SKU", unique = true)
})
public class Product implements Serializable {
    public static final String ENTITY_NAME = "Product";
    public static final String TABLE_NAME = "product";
    public static final String COLUMN_ID_NAME = "idproduct";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_DESC_NAME = "`desc`";
    public static final String COLUMN_SKU_NAME = "SKU";
    public static final String COLUMN_CATERGORY_NAME = "catergory";
    public static final String COLUMN_PRICE_NAME = "price";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = 7280310121167291140L;


    private Integer id;

    private String name;

    private String desc;

    private String sku;

    private String catergory;

    private BigDecimal price;

    private Discount discount;

    private ProductCatergory catergory1;

    private ProductInventory inventory;

    private Instant createdAt;

    private Instant updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_ID_NAME, nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = COLUMN_NAME_NAME, length = 45)
    public String getName() {
        return name;
    }

    @Column(name = COLUMN_DESC_NAME, length = 45)
    public String getDesc() {
        return desc;
    }

    @Column(name = COLUMN_SKU_NAME, nullable = false, length = 45)
    public String getSku() {
        return sku;
    }

    @Column(name = COLUMN_CATERGORY_NAME, length = 45)
    public String getCatergory() {
        return catergory;
    }

    @Column(name = COLUMN_PRICE_NAME, precision = 10)
    public BigDecimal getPrice() {
        return price;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "discount_id", nullable = false)
    public Discount getDiscount() {
        return discount;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "catergory_id", nullable = false)
    public ProductCatergory getCatergory1() {
        return catergory1;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inventory_id", nullable = false)
    public ProductInventory getInventory() {
        return inventory;
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