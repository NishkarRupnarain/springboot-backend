package com.Nishkar.springbootbackend.G4L_Reverside.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = Discount.ENTITY_NAME)
@Table(name = Discount.TABLE_NAME)
public class Discount implements Serializable {
    public static final String ENTITY_NAME = "Discount";
    public static final String TABLE_NAME = "discount";
    public static final String COLUMN_ID_NAME = "iddiscount";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_DESC_NAME = "`desc`";
    public static final String COLUMN_DISCOUNTPERCENTAGE_NAME = "discount_percentage";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = 5206229390087788541L;


    private Integer id;

    private String name;

    private String desc;

    private BigDecimal discountPercentage;

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

    @Column(name = COLUMN_DISCOUNTPERCENTAGE_NAME, precision = 10)
    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
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