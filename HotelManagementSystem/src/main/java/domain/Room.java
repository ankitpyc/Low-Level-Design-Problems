package domain;

import domain.enums.RoomType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Room {
    RoomType roomType;
    Boolean isAc;
    String RoomNo;

    public Room(RoomType roomType, Boolean isAc, String roomNo) {
        this.roomType = roomType;
        this.isAc = isAc;
        RoomNo = roomNo;
    }

}
