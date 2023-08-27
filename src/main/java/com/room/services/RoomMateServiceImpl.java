package com.room.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.entity.RoomMate;
import com.room.repository.RoomMatesRepository;

@Service
public class RoomMateServiceImpl implements RoomMateService {

	@Autowired
	public RoomMatesRepository repo;
	@Override
	public RoomMate saveRoomMate(RoomMate roomMate) {
		// TODO Auto-generated method stub
		RoomMate result=repo.save(roomMate);
		return result;
	}

	@Override
	public List<RoomMate> getRoomMates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomMate getRoomMateByNumber(long mobileNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
