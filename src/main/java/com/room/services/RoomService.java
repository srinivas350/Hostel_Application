package com.room.services;

import java.util.List;

import com.room.entity.Room;

public interface RoomService {
	
	public Room createRoom(Room room);
	public Room getRoomById(int roomNumber);
	public List<Room> getRooms();

}
