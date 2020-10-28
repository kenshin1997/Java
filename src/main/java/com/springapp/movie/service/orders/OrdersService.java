package com.springapp.movie.service.orders;

//import com.springapp.movie.models.orders.Order;
import com.springapp.movie.models.orders.Orders;
import com.springapp.movie.models.product.Product;
import com.springapp.movie.models.users.User;
import com.springapp.movie.repository.orders.OrdersRepository;
        import com.springapp.movie.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

        import java.util.Calendar;
        import java.util.List;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private UserService userService;

    public void saveOrders(Orders order){
        ordersRepository.save(order);
    }

    public void saveOrderFromController(User user, List<Product> productList){

        Calendar calendar = Calendar.getInstance();
        Long commandOrder = ordersRepository.getLastCommandOrder();
        commandOrder++;
        for (Product product : productList) {
           Orders order = new Orders(product.getDescription().getOrders(),product.getId(),commandOrder,calendar.getTime(),user);
           saveOrders(order);
           user.addOrders(order);
           userService.saveUser(user);
        }
    }
}
