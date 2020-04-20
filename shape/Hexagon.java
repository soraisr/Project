package shape;

import exceptions.NegativeLengthException;

public class Hexagon extends Circle {
	public Hexagon(double a){
		super(a);
	}
	
	@Override
	public double calculate()
	{
		return  Math.pow(radius,2) * 1.5 * Math.sqrt(3);
	}
}