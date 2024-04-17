package com.compassuol.estagio.springcourse.repositories;

import com.compassuol.estagio.springcourse.entities.OrderItem;
import com.compassuol.estagio.springcourse.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
