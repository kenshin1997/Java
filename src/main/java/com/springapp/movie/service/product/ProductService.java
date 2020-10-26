package com.springapp.movie.service.product;

import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.models.description.Description;
import com.springapp.movie.models.photo.Photo;
import com.springapp.movie.models.product.Product;
import com.springapp.movie.repository.photo.PhotoRepository;
import com.springapp.movie.repository.product.ProductRepository;
import com.springapp.movie.service.characteristics.CharacteristicsService;
import com.springapp.movie.service.description.DescriptionService;
import com.springapp.movie.service.photo.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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



    public void addPhotos(){
        Product product =  findProductById((long) 82);
     Photo photo1= new Photo();
     photo1.setUrl("https://www.pandasecurity.com/mediacenter/src/uploads/2013/11/pandasecurity-facebook-photo-privacy.jpg");
     photo1.setMain(false);
     photo1.setProduct(product);
     Photo photo2= new Photo();
     photo2.setUrl("https://s23527.pcdn.co/wp-content/uploads/2019/12/Downside-Up-745x449.jpg.optimal.jpg");
     photo2.setMain(false);
        photo2.setProduct(product);
     Photo photo3= new Photo();
     photo3.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR0VcoYa23hfZZozsAFk9IorYvevwyD_ZRNkg&usqp=CAU");
     photo3.setMain(false);
        photo3.setProduct(product);
     Photo photo4= new Photo();
     photo4.setUrl("https://i.pinimg.com/originals/3b/8a/d2/3b8ad2c7b1be2caf24321c852103598a.jpg");
     photo4.setMain(false);
        photo4.setProduct(product);
        List<Photo> photos = new ArrayList<>();
        photos.add(photo1);
        photos.add(photo2);
        photos.add(photo3);
        photos.add(photo4);
        photoService.savePhotos(photos);
        product.addPhoto(photo1);
        product.addPhoto(photo2);
        product.addPhoto(photo3);
        product.addPhoto(photo4);
        productRepository.save(product);
    }
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
        photo.setProduct(product);
        photo.setUrl("https://images-na.ssl-images-amazon.com/images/I/81DVq-oRCkL._AC_SL1500_.jpg");
        product.setDescription(description);
        product.setCharacteristics(characteristics);
//        product.setPhoto(photo);
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
