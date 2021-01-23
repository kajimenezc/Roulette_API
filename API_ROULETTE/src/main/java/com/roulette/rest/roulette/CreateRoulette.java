package com.spring.api.rest.Roulette;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.entitys.Roulette;
@RestController
@RequestMapping("Create")
public class CreateRoulette {
		@GetMapping
		public ResponseEntity<Long> getProduct(){
			Roulette roulette = new Roulette();
			roulette.setId(1L);

			return ResponseEntity.ok(roulette.getId());
		}
}