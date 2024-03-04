package com.example.DBHotelAPI_test.service;

import com.example.DBHotelAPI_test.model.Hotel;

import java.util.List;

public interface HotelService {
    public String createHotel(Hotel hotel);
    public String updateHotel(Hotel hotel);
    public String deleteHotel(Integer hotelId);
    public Hotel getHotel(Integer hotelId);
    public List<Hotel> getAllHotel();
}
