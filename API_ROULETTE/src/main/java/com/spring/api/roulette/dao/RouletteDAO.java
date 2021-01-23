package com.spring.api.roulette.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entitys.Roulette;
public interface RouletteDAO extends JpaRepository<Roulette, Long> {
}