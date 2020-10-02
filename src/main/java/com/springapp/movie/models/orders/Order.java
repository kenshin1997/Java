package com.springapp.movie.models.orders;


import com.springapp.movie.models.users.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
//    @JoinColumn(name = "user")
//    private User user;
//    private long productId;
//    private int  quantity;
//    private Date date;
//}
