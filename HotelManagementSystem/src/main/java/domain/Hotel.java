package domain;

import domain.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Hotel {
    String hotelId;
    Map<RoomType, Map<Room,List<Bookings>>> bookings;
    List<HotelStaff> staffs;
    Address address;
}
