import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	// Ensures the default speed is zero
	@Test public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertEquals(0, car1.getSpeed());
	}
	
	@Test public void accelerates(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertEquals(10, car1.getSpeed());
	}
	
	@Test public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertEquals(100, car1.getSpeed());
	}
	
	// A simple "toString" method test.
	@Test public void createsAString(){
		Car car1 = new Car("Red", 100);
		assertEquals("Color: Red, Speed: 0", car1.toString());
	}

	// Create and pass test for deceleration.
	
	// Create and pass test for no deceleration below 0.

	
}
