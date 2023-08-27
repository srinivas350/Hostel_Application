package com.room.services;

import java.util.List;

import com.room.entity.RoomMate;

public interface RoomMateService {
	
	public RoomMate saveRoomMate(RoomMate roomMate);
	public List<RoomMate> getRoomMates();
	public RoomMate getRoomMateByNumber(long mobileNumber);

}
