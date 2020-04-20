package shape;

import exceptions.NegativeLengthException;

public class Circle implements Shape {
	protected double radius;
	public Circle(double radius){
		this.radius = radius ;
		if (radius < 0)
			throw new NegativeLengthException(" required Radius > 0 "); 
	}
	
	@Override
	public double calculate()
	{
		return Math.pow(radius,2)*Math.PI ;
	}

}

