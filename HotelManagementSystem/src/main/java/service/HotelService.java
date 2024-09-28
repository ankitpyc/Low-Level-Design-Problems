package service;

import domain.Address;
import domain.Hotel;
import domain.Repository.HotelRepository;
import domain.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelService {

    public static int hotelId = 0;

    Map<String, Hotel> hotelRepository = HotelRepository.getHotelRepository();

    RoomService roomService = new RoomService();

    public void addHotel(String name, Address address, int deluxCount, int singleCount, int doubleCount) {

        Hotel hotel = Hotel.builder().hotelId(String.valueOf(hotelId++)).address(address).bookings(new HashMap<>()).build();

        roomService.addRoomToHotel(hotel, RoomType.DELUXE, deluxCount);
        roomService.addRoomToHotel(hotel, RoomType.DOUBLE, doubleCount);
        roomService.addRoomToHotel(hotel, RoomType.SINGLE, singleCount);

        HotelRepository.save(hotel);

    }


}
