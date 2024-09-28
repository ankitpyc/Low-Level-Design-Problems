package service;

import domain.Bookings;
import domain.Hotel;
import domain.Room;
import domain.enums.RoomType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoomService {


    public void addRoomToHotel(Hotel hotel, RoomType roomType, int count) {
        for (int i = 0; i < count; i++) {
            Room room = new Room();
            room.setRoomType(roomType);
            room.setRoomNo(String.valueOf(roomType.toString() + (i + 1)));
            Map<Room, List<Bookings>> bookingsMap = hotel.getBookings().get(roomType);
            bookingsMap.put(room, new ArrayList<>());
        }
    }

}
