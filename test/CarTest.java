import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CarTest {

	@Test 
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	@Test 
	public void canAccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	@Test 
	public void canDoToString(){
		Car car1 = new Car("Red", 100);
		assertThat(car1.toString(), is("Color: Red, Speed: 0"));
	}

	// Create and pass test for deceleration.
	@Test
	public void canDecelerate(){
		Car car1 = new Car("Red", 100);
		car1.decelerate(10);
		assertThat(car1.getSpeed(), is(0));
		
	}
	
	// Create and pass test for no deceleration below 0.
	public void cannotDecelerateBeyondMinSpeed(){
		Car car1 = new Car("Red", 100);
		car1.decelerate(0);
		assertThat(car1.getSpeed(), is(0));
		
	}
}
