package com.spring2022.Spring2022.repositories;

import com.spring2022.Spring2022.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
