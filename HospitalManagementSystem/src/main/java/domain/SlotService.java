package domain;

import java.sql.Time;
import java.time.Duration;
import java.util.*;

public class SlotService {

    Calendar c = Calendar.getInstance();

    private static final Duration duration = Duration.ZERO.plusHours(1);

    Map<Integer, String> slotMap = new HashMap<>();

    public SlotService(){
        slotMap.put(1,"9:00 AM");
        slotMap.put(2,"10:00 AM");
        slotMap.put(3,"11:00 AM");
        slotMap.put(4,"12:00 AM");
        slotMap.put(5,"13:00 AM");
        slotMap.put(6,"1:00 AM");
        slotMap.put(7,"9:00 AM");
        slotMap.put(8,"9:00 AM");
        slotMap.put(9,"9:00 AM");
        slotMap.put(10,"9:00 AM");

    }

    public getStartDateTime(){

    }

}
