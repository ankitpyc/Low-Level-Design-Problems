package domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Snake extends Point {
    Point to;

    public Snake(Point from, Point to) {
        super(from.getX(), from.getY());
    }
}
