package com.springapp.movie.service.user;

import com.springapp.movie.entrys.form.BucketForm;
import com.springapp.movie.models.users.User;
import com.springapp.movie.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUserFromController(BucketForm bucketForm){
        User user = userRepository.findUserByPhone( bucketForm.getPhone());
        if(user ==null) {
           user=new User(bucketForm.getName(),bucketForm.getEmail(),bucketForm.getPhone());
           saveUser(user);
        }
        return  user;
    }
    public void saveUser(User user){
        userRepository.save(user);
    }

}
