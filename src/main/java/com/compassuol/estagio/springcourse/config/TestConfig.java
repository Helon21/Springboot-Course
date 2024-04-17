package com.compassuol.estagio.springcourse.config;

import com.compassuol.estagio.springcourse.entities.Category;
import com.compassuol.estagio.springcourse.entities.Order;
import com.compassuol.estagio.springcourse.entities.Product;
import com.compassuol.estagio.springcourse.entities.User;
import com.compassuol.estagio.springcourse.entities.enums.OrderStatus;
import com.compassuol.estagio.springcourse.repositories.CategoryRepository;
import com.compassuol.estagio.springcourse.repositories.OrderRepository;
import com.compassuol.estagio.springcourse.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Waifus");
        Category cat3 = new Category(null, "Guns");

        Product p1 = new Product(null, "Waifu do Exército", "Waifu do exército", 97.85, "https://prompthero.com/rails/active_storage/representations/proxy/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaEpJaWt5WlRVMll6VTVOQzAxWlRsa0xUUXpZbUl0T1dWaVlTMWpOV0V5WlRJd1kySTVOVElHT2daRlZBPT0iLCJleHAiOm51bGwsInB1ciI6ImJsb2JfaWQifX0=--3c606f6d4f42bd870e0573e99f83c1e64b881f54/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaDdDRG9MWm05eWJXRjBPZ2wzWldKd09oUnlaWE5wZW1WZmRHOWZiR2x0YVhSYkIya0NBQVJwQWdBRU9ncHpZWFpsY25zSk9oTnpkV0p6WVcxd2JHVmZiVzlrWlVraUIyOXVCam9HUlZRNkNuTjBjbWx3VkRvT2FXNTBaWEpzWVdObFZEb01jWFZoYkdsMGVXbEwiLCJleHAiOm51bGwsInB1ciI6InZhcmlhdGlvbiJ9fQ==--7c441653463c65ae957b55739f034cde0ce51c9d/150747.jpeg");
        Product p2 = new Product(null, "Re:Zero, emillia", "emilia de re:zero junto do puck", 35.70, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkU8dulhQ0MgtotnbtnOnkYC5mKM9lo9wlAw&s");
        Product p3 = new Product(null, "Steins gate, makise kurisu", "Waifu neurocientista que volta no tempo", 40.52,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSy6StItt8oe3qh_B5B4echKNYENJLYhZTRQ&s");
        Product p4 = new Product(null, "Jujutsu Kaisen", "Waifu multimilionária", 150.50, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnQ7Qn1MV0l4N47UmzQTW4EOWhD9-HYscrEQ&s");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat2);
        p3.getCategories().add(cat2);
        p4.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));

        User u1 = new User(null, "Helena", "maria@gmail.com", "9999999", "12345");
        User u2 = new User(null, "Emilly", "emilly@gmail.com", "9999999", "12345");
        User u3 = new User(null, "Helen", "helen@gmail.com", "9999999","12345");

        Order o1 = new Order(null, Instant.parse("2024-04-16T12:08:12Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2024-04-03T18:07:22Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2024-04-05T16:25:42Z"), OrderStatus.WAITING_PAYMENT, u3);
        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
