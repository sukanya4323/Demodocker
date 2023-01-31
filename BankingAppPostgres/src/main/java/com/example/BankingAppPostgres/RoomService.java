package com.example.BankingAppPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
	
	@Autowired
	public RoomRepository repo;
	
	public Iterable<Room> getRooms(){
		return repo.findAll();
	}

	 public void saveRoom(String name) {
		 
		 Room r = new Room();
		 r.setRoom_name(name);
		 repo.save(r);
	 }
}
