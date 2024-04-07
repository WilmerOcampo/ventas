package com.wo.ventas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    @Id
    private Integer categoryid;
    @NotNull(message = "Obligatorio")
    private String categoryname;
    private String description;

}
