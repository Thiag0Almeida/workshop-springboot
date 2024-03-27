package com.almeidathi.course.repositories;

import com.almeidathi.course.entities.Order;
import com.almeidathi.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
