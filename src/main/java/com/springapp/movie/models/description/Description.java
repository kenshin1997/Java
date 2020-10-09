package com.springapp.movie.models.description;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springapp.movie.models.product.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonIgnoreProperties("description")
    @OneToOne(mappedBy = "description",cascade = CascadeType.ALL)
    private Product product;
    private float price;
    private int quantity;
    @Column(columnDefinition = "int default 1")
    private int orders;
    private String color;
    private String originCountry;

}
