package com.compassuol.estagio.springcourse.repositories;

import com.compassuol.estagio.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
