package com.almeidathi.course.config;

import com.almeidathi.course.entities.Order;
import com.almeidathi.course.repositories.OrderRepository;
import com.almeidathi.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.almeidathi.course.entities.User;

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
        User u1 = new User(null, "Maria Joana", "maria.jo@mail.com", "75989234576", "6543210");
        User u2 = new User(null, "Zé Maia", "maia.ze@mail.com", "77987674632", "1234566");

        Order o1 = new Order(null, Instant.parse("2024-03-27T10:07:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2024-04-19T08:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2024-06-15T19:21:30Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
