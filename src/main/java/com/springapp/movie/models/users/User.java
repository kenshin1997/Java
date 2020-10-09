package com.springapp.movie.models.users;


//import com.springapp.movie.models.orders.Order;
import com.springapp.movie.models.orders.Orders;
import com.springapp.movie.models.question.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private int phone;
    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private List<Orders> orders;
    @OneToMany(mappedBy = "user")
    private List<Question> questions;

    public User(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void addOrders(Orders order) {
        if(orders == null)
            orders = new ArrayList<>();
        orders.add(order);
        order.setUser(this);
    }

    public void addQuestions(Question question) {
        if(questions == null)
            questions = new ArrayList<>();
        questions.add(question);
        question.setUser(this);
    }
}
