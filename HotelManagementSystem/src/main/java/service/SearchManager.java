package service;

import domain.Bookings;
import domain.Hotel;
import domain.Repository.HotelRepository;
import domain.Room;
import domain.enums.RoomType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class SearchManager implements SearchManangerInf {

    Map<String, Hotel> hotelRepository = HotelRepository.getHotelRepository();

    public Hotel SearchRoomByHotelId(String hotelId) {
        Hotel hotel = hotelRepository.get(hotelId);
        return hotel;
    }

    public List<Hotel> getHotelWithinTimeSlotAndRoom(Date startDate, Date endDate, RoomType roomType) {
        List<Hotel> hotels = new ArrayList<>();
        for (Map.Entry entry : hotelRepository.entrySet()) {
            Hotel hotel = (Hotel) entry.getValue();
            Map<Room, Bookings> roomBookings = hotel.getBookings().get(roomType);
            for (Map.Entry room : roomBookings.entrySet()) {
                List<Bookings> bookings = (List<Bookings>) room.getValue();
                for (Bookings bookingSlot : bookings) {
                    if (startDate.after(bookingSlot.getEndDateTime()) || endDate.before(bookingSlot.getStartDateTime())) {
                        hotels.add(hotel);
                    }
                }
            }
        }
        return hotels;
    }


}



