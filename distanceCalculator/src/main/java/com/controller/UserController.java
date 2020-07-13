package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.InputDTO;
import com.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@PostMapping(value="/input",  produces="application/json")
	public ResponseEntity storeUser(@RequestBody InputDTO inputdto) {
		userService.storeUser(inputdto);
		Map<String,String> returnMap= new HashMap();
		returnMap.put("message", "record inserted Successfullly");
		returnMap.put("httpStatus", "201 OK");
		return ResponseEntity.ok(returnMap);
		
		
	}
	
	@GetMapping(value="/getDistance/{userName}",  produces="application/json")
	private ResponseEntity<Map> getDistance(@RequestParam String startTimeStamp ,@RequestParam String endTimeStamp,@PathVariable String userName ) {
		Float distance= userService.getDistance(startTimeStamp,endTimeStamp,userName);
		Map<String,String> returnMap= new HashMap();
		returnMap.put("message", "Distance Travelled b/w "+startTimeStamp+" and "+ endTimeStamp+" is "+distance);
		returnMap.put("httpStatus", "200 OK");
		return ResponseEntity.ok(returnMap);
		
		
	}
}
