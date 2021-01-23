package com.spring.api.rest.user;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.api.user.dao.UserDAO;
import com.spring.entitys.User;
@RestController
@RequestMapping("CloseBet")
public class CloseBet {
	@Autowired
	private UserDAO userDAO;
	private int numberRandom = ThreadLocalRandom.current().nextInt(1, 36);
	private float modul;
	private String colourselec;
	@GetMapping
	public ResponseEntity<List<User>> getUser(){
	List<User> user = userDAO.findAll();
    	for (User CurrentUser : user) {
    	long  number = CurrentUser.getNumber();
    	float value = CurrentUser.getValue();
    	String colour = CurrentUser.getColour();
    	/*calculation of bets*/
    	modul = number % 2;
    		if (modul == 0){
    			colourselec = "ROJOS";
    		}else {
    			colourselec = "NEGROS";
    		}
    		if (number != 0) {
    			if ( number == numberRandom ) {
    				value = value * 5;
    				CurrentUser.setValue(value);
    			} else {
    				CurrentUser.setValue(0);;
    			}
    		}else if(colourselec != " "){
    			if (colourselec == colour) {
    				value = value * 1.8f;
    				CurrentUser.setValue(value);
    			}else {
    				CurrentUser.setValue(0);
    			}
    		}
    	}
    	
	return ResponseEntity.ok(user);
	}
}