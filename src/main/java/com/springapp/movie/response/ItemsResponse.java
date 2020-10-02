package com.springapp.movie.response;

import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.models.description.Description;
import com.springapp.movie.models.photo.Photo;
import com.springapp.movie.models.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemsResponse {
    private Product product;
    private Description description;
    private Characteristics characteristics;
    private Photo photo;
}
