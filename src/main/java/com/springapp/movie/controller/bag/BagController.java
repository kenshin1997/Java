package com.springapp.movie.controller.bag;

import com.springapp.movie.entrys.form.BucketForm;
import com.springapp.movie.models.users.User;
import com.springapp.movie.service.mail.MailService;
import com.springapp.movie.service.orders.OrdersService;
import com.springapp.movie.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bag")
public class BagController {

    @Autowired
    UserService userService;
    @Autowired
    OrdersService ordersService;

    @RequestMapping(value="/form", method= RequestMethod.POST)
    public void personForm(@RequestBody BucketForm bucketForm){
        User user = userService.saveUserFromController(bucketForm);
        ordersService.saveOrderFromController(user,bucketForm.getProducts());
    }
}
