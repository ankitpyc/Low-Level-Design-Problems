package domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Player {
    private String name;
    private String email;
    Point currPosition;

    public Player() {
        currPosition = new Point(0, 0);
    }
}
