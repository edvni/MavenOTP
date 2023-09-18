package maven_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.junit.jupiter.api.Test;

public class DistanceCalculatorTest {
	
	@Test
    public void testDistanceCalculation() {
        // Define two points for testing
        Vector2D point1 = new Vector2D(1, 2); // Replace with your coordinates
        Vector2D point2 = new Vector2D(4, 6); // Replace with your coordinates

        // Calculate the expected distance manually (you can use a trusted method)
        double expectedDistance = calculateDistanceManually(point1, point2);

        // Calculate the distance using the DistanceCalculator
        double calculatedDistance = point1.distance(point2);

        // Assert that the calculated distance matches the expected distance
        assertEquals(expectedDistance, calculatedDistance, 0.0001); // Adjust delta as neededd
        // COMMENTS
    }

    // A helper method to calculate distance manually for testing
    private double calculateDistanceManually(Vector2D p1, Vector2D p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

}
