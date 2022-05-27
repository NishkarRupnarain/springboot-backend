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
@Entity(name = ProductCatergory.ENTITY_NAME)
@Table(name = ProductCatergory.TABLE_NAME)
public class ProductCatergory implements Serializable {
    public static final String ENTITY_NAME = "ProductCatergory";
    public static final String TABLE_NAME = "product_catergory";
    public static final String COLUMN_ID_NAME = "idproduct_catergory";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_DESC_NAME = "`desc`";
    public static final String COLUMN_CREATEDAT_NAME = "created_at";
    public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    private static final long serialVersionUID = 7681177021177919775L;


    private Integer id;

    private String name;

    private String desc;

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

    @Column(name = COLUMN_CREATEDAT_NAME)
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Column(name = COLUMN_UPDATEDAT_NAME)
    public Instant getUpdatedAt() {
        return updatedAt;
    }

}