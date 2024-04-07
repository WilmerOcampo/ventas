package com.wo.ventas.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;
    private String productname;
    private String quantityperunit;
    private Double unitprice;
    private Integer unitsinstock;
    private Integer unitsonorder;
    private Integer reorderlevel;
    private Boolean discontinued;

    @ManyToOne
    @JoinColumn(name = "supllierid")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;
}
