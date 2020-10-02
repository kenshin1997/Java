package com.springapp.movie.service.product;

import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.models.description.Description;
import com.springapp.movie.models.photo.Photo;
import com.springapp.movie.models.product.Product;
import com.springapp.movie.repository.characteristics.CharacteristicsRepository;
import com.springapp.movie.repository.description.DescriptionRepository;
import com.springapp.movie.repository.photo.PhotoRepository;
import com.springapp.movie.repository.product.ProductRepository;
import com.springapp.movie.service.characteristics.CharacteristicsService;
import com.springapp.movie.service.description.DescriptionService;
import com.springapp.movie.service.photo.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private PhotoService photoService;
    @Autowired
    private DescriptionService descriptionService;
    @Autowired
    private CharacteristicsService characteristicsService;
    public void addTest(){
      Product product = new Product();
      product.setName("MD8545-9");
      product.setCategory("Chandelier");
        Description description = new Description();
        description.setColor("Gold");
        description.setOriginCountry("Moldova");
        description.setPrice(450);
        description.setQuantity(25);
//        description.setProduct(product);
        Characteristics characteristics = new Characteristics();
//        characteristics.setProduct(product);
        characteristics.setDimension(670);
        characteristics.setHeight(220);
        Photo photo = new Photo();
        photo.setMain(true);
//        photo.setProduct(product);
        photo.setUrl("https://images-na.ssl-images-amazon.com/images/I/81DVq-oRCkL._AC_SL1500_.jpg");
        product.setDescription(description);
        product.setCharacteristics(characteristics);
        product.setPhoto(photo);
        productRepository.save(product);
        descriptionService.saveDescription(description);
        characteristicsService.saveCharacteristics(characteristics);
        photoService.savePhoto(photo);
    }
    public List<Product> findProductsByCategory(String category){
        return productRepository.findProductsByCategory(category);
    }

    public Product findProductById (Long id){
        return  productRepository.findOne(id);
    }

}
