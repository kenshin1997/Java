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
    @JsonIgnoreProperties("photo")
    @OneToOne(mappedBy = "photo")
    private Product product;
    private String url;
    private boolean main;
}
