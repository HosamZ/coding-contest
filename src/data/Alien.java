package data;

import coordinates.Coordinate;
import lombok.Data;

@Data
public class Alien {

    private Coordinate coordinate;
    private String direction;
}
