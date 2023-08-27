package com.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.room.entity.Room;
import com.room.services.RoomService;

@RestController
public class RoomController {
	
	@Autowired
	public RoomService service;
	
	@PostMapping("/room/createRoom")
	public ResponseEntity<Room> createRoom(@RequestBody Room room)
	{
		Room response=service.createRoom(room);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/room/getRooms")
	public ResponseEntity<List<Room>> getAllRooms()
	{
		return new ResponseEntity<>(service.getRooms(),HttpStatus.ACCEPTED);
	}

	@GetMapping("/room/getRoom/{roomNumber}")
	public ResponseEntity<Room> getRoomById(@PathVariable String roomNumber)
	{
		return new ResponseEntity<>(service.getRoomById(Integer.parseInt(roomNumber)),HttpStatus.ACCEPTED);
	}

}
