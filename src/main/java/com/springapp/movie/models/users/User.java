package com.springapp.movie.models.users;

//import com.springapp.movie.models.orders.Order;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private long phone;
//    @OneToMany(mappedBy = "user")
//    private List<Order> orders;
    @OneToMany(mappedBy = "user")
    private List<Question> questions;

//    public void addOrders(Order order) {
//        if(orders == null)
//            orders = new ArrayList<>();
//        orders.add(order);
//        order.setUser1(this);
//    }

    public void addQuestions(Question question) {
        if(questions == null)
            questions = new ArrayList<>();
        questions.add(question);
        question.setUser(this);
    }
}
