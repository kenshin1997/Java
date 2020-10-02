package com.springapp.movie.models.characteristics;
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
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonIgnoreProperties("characteristics")
    @OneToOne(mappedBy = "characteristics",cascade = CascadeType.ALL)
    private Product product;
    private String name;
    private String category;
    private float height;
    private float dimension;

}
