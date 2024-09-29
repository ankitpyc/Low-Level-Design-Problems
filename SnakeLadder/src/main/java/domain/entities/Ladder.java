package domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ladder extends Point {
    Point to;

    public Ladder(Point from, Point to) {
        super(from.getX(), from.getY());
    }
}
