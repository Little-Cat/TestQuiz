package com.example.marketplace.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Products", schema = "dbo")
public class ProductEntity implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String Name;

    private Float Price;
}
