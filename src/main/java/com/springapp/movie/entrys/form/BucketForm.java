package com.springapp.movie.entrys.form;

import com.springapp.movie.models.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BucketForm {
    private String name;
    private int phone;
    private String email;
    private List<Product> products;
}
