import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params. provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 
public class Testing {

	@ParameterizedTest
	@MethodSource("stringProvider")

	void test(double num , String[] params) {
		double result = -1 ;
		result = AreaCalculator.calculate(params) ;
		assertEquals(num,result, 0.5);
	}

	static Stream<Arguments> stringProvider() {
	    return Stream.of(
	        Arguments.of(0.0 ,new String[] {"triangle", "10", "5", "20 "}),
	        Arguments.of(60.0 , new String[]{"rect", "3", "20"}),
	        Arguments.of(1.0 ,new String[] {"circle", "-2"}),
	        Arguments.of(79.0 ,new String[] {"circle", "5"}),
	        Arguments.of(60.0 ,new String[]{"meow", "3", "20"}),
	        Arguments.of(73.0 ,new String[] {"triangle", "10", "15", "20"}),
	        Arguments.of(10.0 ,new String[] {"triangle", "ABC", "-15", "20"})  
	    ); 
	}
}