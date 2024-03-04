package com.example.DBHotelAPI_test.controller;

import com.example.DBHotelAPI_test.model.Hotel;
import com.example.DBHotelAPI_test.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotelTest")
public class HotelAPIController {
    //Hotel hotel;
    HotelService hotelService;
    public HotelAPIController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    //read a specific hotel detail from DB
    @GetMapping("/{id}")
    public Hotel getHotel( @PathVariable("id") int id){
        return hotelService.getHotel(id);
                //new Hotel(1, "hotel1", "hotel1Address", "7821234567");
    }
    //read all hotel detail from DB
    @GetMapping()
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotel();
    }

    @PostMapping
    public String createHotel(@RequestBody Hotel hotel){
        hotelService.createHotel(hotel);
        return "hotel info created successfully";
    }

    @PutMapping
    public String updateHotel(@RequestBody Hotel hotel){
        hotelService.updateHotel(hotel);
        return "hotel info update successfully";
    }

    @DeleteMapping("{id}")
    public String deleteHotel(@PathVariable("id") int id){
        hotelService.deleteHotel(id);
        return "hotel info delete successfully";
    }
}
