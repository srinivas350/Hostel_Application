package com.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
