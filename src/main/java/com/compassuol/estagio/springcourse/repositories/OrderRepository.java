package com.compassuol.estagio.springcourse.repositories;

import com.compassuol.estagio.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
