package com.example.BankingAppPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//from controller to service then service to repo
@RestController
public class RoomController {
	
	@Autowired
	public RoomService service;
	
	@GetMapping("getRooms")
	public  Iterable<Room> getRooms(){
		return service.getRooms();
	}
	
	@GetMapping("saveRoom")
	public void saveRooms(@RequestParam String name) {
		
		
		service.saveRoom(name);
	}

}
