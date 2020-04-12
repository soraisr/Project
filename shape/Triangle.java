
package shape;

public class Triangle implements Shape {
	private final double a;
	private final double b; 
	private final double c;

	public Triangle(double a , double b , double c){
		this.a = a ;
		this.a = b ;
		this.c = c ;
	}
	
	@Override
	public double calculate()
	{
  			return  0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 

	}
}

