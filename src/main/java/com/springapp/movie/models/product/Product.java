package com.springapp.movie.models.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.models.description.Description;
import com.springapp.movie.models.photo.Photo;
import com.springapp.movie.models.question.Question;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private List<Photo> photos;

    public void addPhoto ( Photo photo){
        if(photos == null){
            photos = new ArrayList<>();
        }
        photos.add(photo);
        photo.setProduct(this);
    }
}
