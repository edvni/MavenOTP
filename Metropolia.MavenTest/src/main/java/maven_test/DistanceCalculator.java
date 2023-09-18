package maven_test;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

public class DistanceCalculator {
	public static void main(String[] args) {
        Vector2D point1 = new Vector2D(1, 2);
        Vector2D point2 = new Vector2D(4, 6);

        double distance = point1.distance(point2);
        System.out.println("Distance between the two points: " + distance); // distance = √((x2 - x1)² + (y2 - y1)²)
    }
}
