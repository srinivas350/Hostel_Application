package com.room.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.entity.Room;
import com.room.repository.RoomRepository;
@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	public RoomRepository repo;
	@Override
	public Room createRoom(Room room) {
		// TODO Auto-generated method stub
		Room response=repo.save(room);
		return response;
	}

	@Override
	public Room getRoomById(int roomNumber) {
		// TODO Auto-generated method stub
		return repo.findById(roomNumber).orElseThrow();
	}

	@Override
	public List<Room> getRooms() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
