package com.roulette.dao.roulette;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entitys.Roulette;
public interface RouletteDAO extends JpaRepository<Roulette, Long> {
}