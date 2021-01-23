package com.spring.api.user.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entitys.User;
public interface UserDAO extends JpaRepository<User, Long> {
}