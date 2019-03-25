package directions;

import coordinates.Coordinate;


public interface Direction {

    String getName();
    Coordinate calculate(Coordinate coordinate, int steps);
}
