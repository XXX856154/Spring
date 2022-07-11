package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class UserBean
{
    @Bean
    public User user1()
    {

        User user=new User();
        return user;
    }
}
