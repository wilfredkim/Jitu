package com.example.jitu.controller;

import com.example.jitu.models.User;
import com.example.jitu.service.UserServiceI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserControllerTest {
    @Autowired
    UserServiceI userServiceI;
    private static Logger log = LoggerFactory.getLogger(UserControllerTest.class);


    @BeforeEach
    void setUp() {
        log.info("@BeforeAll - executes once before all test methods in this class");

    }

    @AfterEach
    void tearDown() {
        log.info("@BeforeEach - executes before each test method in this class");

    }

    @Test
    void getAllUsers() {
    }

    @Test
    void findUserById() {
        Long id = 1L;
        Optional<User> optionalUser = userServiceI.findById(id);
        User user = optionalUser.orElse(null);
        assert user != null;
        assertEquals(id, user.getId());
    }

    @Test
    void saveUser() {

        User user = new User();
        user.setEmail("wilfredkim5@gmail.com");
        user.setFirstname("");
        user.setOthernames("");
        user.setPassword("");
        User savedUser = userServiceI.createUser(user);
        assertNotNull(savedUser);
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void deleteAllUsers() {
    }
}