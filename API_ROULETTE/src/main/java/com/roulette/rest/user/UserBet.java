package com.spring.api.rest.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.api.user.dao.UserDAO;
import com.spring.entitys.User;
@RestController
@RequestMapping("UserBet")
public class UserBet {
	@Autowired
	private UserDAO userDAO;
	private float numberbet; 
	private String colour;
	private String user;
	@GetMapping("/getUser")
	public ResponseEntity<String> user(@RequestHeader("accept-language") String language) {
		
	    return new ResponseEntity<String>(user, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User newUser = userDAO.save(user);
		numberbet = newUser.getNumber();
		colour = newUser.getColour();  
		colour = colour.toUpperCase();
		/*Validation of data to be recorded*/
		if (newUser.getColour() == " ") {
			if( numberbet > 0 & numberbet < 100 ) {
				
				return ResponseEntity.ok(newUser);
			}else {
				
				return ResponseEntity.notFound().build();
			}
		}else{
			if (colour == "ROJO" & colour == "NEGRO") {
				
				return ResponseEntity.ok(newUser);
			}else {
				
				return ResponseEntity.notFound().build();
			}
		}
	}
}