package com.springapp.movie.models.photo;

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
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonIgnoreProperties("product")
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "product_id")
    private Product product;
    private String url;
    private boolean main;
}
