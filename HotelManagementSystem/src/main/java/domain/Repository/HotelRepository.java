package domain.Repository;

import domain.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HotelRepository {

    public static int id;

    private static final Map<String, Hotel> hotelMap = new HashMap<>();

    public static Map<String, Hotel> getHotelRepository() {
        return hotelMap;
    }

    public static void save(Hotel hotel) {

        hotelMap.put(String.valueOf(id++), hotel);
    }

}
