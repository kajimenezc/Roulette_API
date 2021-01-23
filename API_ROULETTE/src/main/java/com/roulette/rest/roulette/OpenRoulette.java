package com.spring.api.rest.Roulette;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.api.roulette.dao.RouletteDAO;
import com.spring.entitys.Roulette;
@RestController
@RequestMapping("Open")
public class OpenRoulette {
	@Autowired
	private RouletteDAO rouletteDAO;
	@RequestMapping(value="{rouletteId}")
	public ResponseEntity<String> getRouletteById(@PathVariable("rouletteId") Long rouletteId){
		Optional<Roulette> optionalRoulette = rouletteDAO.findById(rouletteId);
			if(optionalRoulette.isPresent()) {
				
				return ResponseEntity.ok("Exitosa");
			}else {
				
				return ResponseEntity.ok("Denegada");
			}
		}
}