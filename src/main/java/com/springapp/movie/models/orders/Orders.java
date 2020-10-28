package com.springapp.movie.models.orders;

import com.springapp.movie.models.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private User user;
    private long productId;
    private int  quantity;
    private long commandOrder;
    private Date date;

    public Orders(int quantity, long productId, long commandOrder, Date date, User user) {
        this.user = user;
        this.productId = productId;
        this.quantity = quantity;
        this.commandOrder = commandOrder;
        this.date = date;
    }
}
