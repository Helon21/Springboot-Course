package com.compassuol.estagio.springcourse.config;

import com.compassuol.estagio.springcourse.entities.Order;
import com.compassuol.estagio.springcourse.entities.User;
import com.compassuol.estagio.springcourse.repositories.OrderRepository;
import com.compassuol.estagio.springcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Helena", "maria@gmail.com", "9999999", "12345");
        User u2 = new User(null, "Emilly", "emilly@gmail.com", "9999999", "12345");
        User u3 = new User(null, "Helen", "helen@gmail.com", "9999999","12345");

        Order o1 = new Order(null, Instant.parse("2024-04-16T12:08:12Z"), u1);
        Order o2 = new Order(null, Instant.parse("2024-04-03T18:07:22Z"), u2);
        Order o3 = new Order(null, Instant.parse("2024-04-05T16:25:42Z"), u3);
        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
