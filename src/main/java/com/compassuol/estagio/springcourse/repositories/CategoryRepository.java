package com.compassuol.estagio.springcourse.repositories;

import com.compassuol.estagio.springcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
