package com.roulette.dao.user;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entitys.User;
public interface UserDAO extends JpaRepository<User, Long> {
}