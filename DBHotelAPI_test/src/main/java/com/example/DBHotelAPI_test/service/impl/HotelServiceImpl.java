package com.example.DBHotelAPI_test.service.impl;

import com.example.DBHotelAPI_test.model.Hotel;
import com.example.DBHotelAPI_test.repository.HotelRepository;
import com.example.DBHotelAPI_test.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    HotelRepository hotelRepository;
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    @Override
    public String createHotel(Hotel hotel) {
        hotelRepository.save(hotel);
        return "Success save in createHotel";
    }

    @Override
    public String updateHotel(Hotel hotel) {
        //more business logic here
        hotelRepository.save(hotel);
        return "Success update in updateHotel";
    }

    @Override
    public String deleteHotel(Integer hotelId) {
        hotelRepository.deleteById(hotelId);
        return "Success delete in deleteHotel";
    }
//    public String deleteHotel(Integer hotelId) {
//        Optional<Hotel> optionalHotel = hotelRepository.findById(hotelId);
//        if (optionalHotel.isPresent()) {
//            hotelRepository.delete(optionalHotel.get());
//            return "Hotel with ID " + hotelId + " deleted successfully";
//        } else {
//            return "Hotel with ID " + hotelId + " not found";
//        }
//    }

    @Override
//    public Hotel getHotel(Integer hotelId) {
//        return hotelRepository.findById(hotelId).get();
//    }
    public Hotel getHotel(Integer hotelId) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(hotelId);
        return optionalHotel.orElse(null);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }
}
