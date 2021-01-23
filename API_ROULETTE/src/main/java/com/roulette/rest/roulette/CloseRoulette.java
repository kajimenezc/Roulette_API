package com.roulette.rest.roulette;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roulette.dao.roulette.RouletteDAO;
import com.spring.entitys.Roulette;
@RestController
@RequestMapping("Close")
public class CloseRoulette {
	@Autowired
	private RouletteDAO rouletteDAO;
	@GetMapping
	public ResponseEntity<List<Roulette>> getRoulette(){
		List<Roulette> roulette = rouletteDAO.findAll();
		
		return ResponseEntity.ok(roulette);
		}
}