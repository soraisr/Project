import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
	
	
	@Test
	public void test1() {
		assertEquals(60.0, AreaCalculator.calculate("rect", "3", "20") , 0.001);
	}
	@Test
	public void test2() {
		assertEquals(79.0 ,AreaCalculator.calculate("circle", "5"),0.5);
	}
	
	@Test
	public void test3() {
		assertEquals(64.0,AreaCalculator.calculate("rect", "3.2", "20") , 0.01);
	}
	@Test
	public void test4() {
		assertEquals(0, AreaCalculator.calculate("rect", "-2", "20") , 0.001);
	}
	@Test
	public void test5() {
		assertEquals(-1 ,AreaCalculator.calculate("circle", "-2"),0.5);
	}
	@Test
	public void test6() {
		assertEquals(0,AreaCalculator.calculate("triangle", "10", "5", "20"),0.5);
	}
	@Test
	public void test7() {
		assertEquals(10,AreaCalculator.calculate("triangle", "10", "-15", "20"),0.5);
	
	}
	@Test
	public void test8() {
		assertEquals(-1,AreaCalculator.calculate("meow", "10", "-15", "20"),0.5);
	
	}
	@Test
	public void test9() {
		assertEquals(10,AreaCalculator.calculate("triangle", "abc", "-15", "20"),0.5);
	}
	@Test
	public void test10() {
		assertEquals(10,AreaCalculator.calculate(),0.5);
	
	}
	
	

}
