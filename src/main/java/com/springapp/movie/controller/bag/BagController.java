package com.springapp.movie.controller.bag;

import com.springapp.movie.entrys.form.BucketForm;
import com.springapp.movie.models.users.User;
import com.springapp.movie.service.mail.bag.MailBagService;
import com.springapp.movie.service.orders.OrdersService;
import com.springapp.movie.service.user.UserService;
import lombok.SneakyThrows;
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
    @Autowired
    MailBagService mailBagService;

    @SneakyThrows
    @RequestMapping(value="/form", method= RequestMethod.POST)
    public void personForm(@RequestBody BucketForm bucketForm)  {
        User user = userService.saveUserFromController(bucketForm);
        ordersService.saveOrderFromController(user,bucketForm.getProducts());
        mailBagService.sendEmail("kenshin.1997@mail.ru","Hellow","Nihao bro1",bucketForm);
    }

}
