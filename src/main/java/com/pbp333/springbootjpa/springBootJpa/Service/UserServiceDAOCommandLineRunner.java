package com.pbp333.springbootjpa.springBootJpa.Service;

import com.pbp333.springbootjpa.springBootJpa.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserServiceDAOCommandLineRunner implements CommandLineRunner{

    private static final Logger log = LoggerFactory.getLogger(UserServiceDAOCommandLineRunner.class);

    @Autowired
    private UserServiceDAO userServiceDAO;

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Pedro", "Admin");

        long userInserted = userServiceDAO.insertUser(user);

        log.info("New user created: " + user);


    }
}
