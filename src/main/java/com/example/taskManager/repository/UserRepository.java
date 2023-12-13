package com.example.taskManager.repository;

import com.example.taskManager.entity.Role;
import com.example.taskManager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
