
package shape;

import exceptions.NegativeLengthException;

public class Triangle implements Shape {
	private final double a;
	private final double b; 
	private final double c;

	public Triangle(double a , double b , double c){
		this.a = a ;
		this.b = b ;
		this.c = c ;
		if (!(a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a)) 
			  throw new NegativeLengthException(" required a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a"); 
	}
	
	@Override
	public double calculate()
	{
  			return  0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 

	}
}

