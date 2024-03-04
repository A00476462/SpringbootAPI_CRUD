package com.example.DBHotelAPI_test.repository;

import com.example.DBHotelAPI_test.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
