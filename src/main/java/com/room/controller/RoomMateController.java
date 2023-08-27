package com.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.room.entity.RoomMate;
import com.room.services.RoomMateService;

@RestController
public class RoomMateController {
	
	@Autowired 
	public RoomMateService service;
	
	@PostMapping("/room/saveRoomMate")
	public ResponseEntity<RoomMate> saveRoomMate(@RequestBody RoomMate roomMate)
	{
		RoomMate response=service.saveRoomMate(roomMate);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	

}
