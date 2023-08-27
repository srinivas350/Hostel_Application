package com.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.entity.RoomMate;

public interface RoomMatesRepository extends JpaRepository<RoomMate, Long> {

}
