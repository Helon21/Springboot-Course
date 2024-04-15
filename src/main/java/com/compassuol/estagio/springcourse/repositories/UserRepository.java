package com.compassuol.estagio.springcourse.repositories;

import com.compassuol.estagio.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
