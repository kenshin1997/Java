package com.springapp.movie.models.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.models.description.Description;
import com.springapp.movie.models.photo.Photo;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String category;
    @JsonIgnoreProperties("product")
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="description_id")
    private Description description;
    @JsonIgnoreProperties("product")
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="characteristics_id")
    private Characteristics characteristics;
    @JsonIgnoreProperties("product")
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="photo_id")
    private Photo photo;
}
