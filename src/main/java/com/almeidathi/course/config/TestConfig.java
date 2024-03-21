package com.almeidathi.course.config;

import com.almeidathi.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.almeidathi.course.entities.User;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Joana", "maria.jo@mail.com", "75989234576", "6543210");
        User u2 = new User(null, "Zé Maia", "maia.ze@mail.com", "77987674632", "1234566");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
