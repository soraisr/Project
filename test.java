import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
	
	
	@Test
	public void mySampleTest() {
		assertEquals(60.0, AreaCalculator.calculate("square", "3", "20") , 0.001);
		assertEquals(79.0 ,Math.ceil(AreaCalculator.calculate("circle", "5")),0.001);
		assertEquals(73.0,Math.ceil(AreaCalculator.calculate("triangle", "10", "15", "20")),0.001);
		assertEquals(64.0, AreaCalculator.calculate("square", "3.2", "20") , 0.001);
		assertEquals(0, AreaCalculator.calculate("square", "-2", "20") , 0.001);
		assertEquals(0 ,Math.ceil(AreaCalculator.calculate("circle", "-2")),0.001);
		assertEquals(0,Math.ceil(AreaCalculator.calculate("triangle", "10", "5", "20")),0.001);
		assertEquals(0,Math.ceil(AreaCalculator.calculate("triangle", "10", "-15", "20")),0.001);
		assertEquals(10,Math.ceil(AreaCalculator.calculate("triangle", "10", "-15", "20")),0.001);//insert error mode
	}

}
