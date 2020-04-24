package pluginShapes;

import exceptions.NegativeLengthException;
import shape.Circle;

public class Hexagon extends Circle {
	public Hexagon(double a){
		super(a);
	}
	
	@Override
	public double calculate()
	{
		System.out.println("WTF IT WORKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return  Math.pow(radius,2) * 1.5 * Math.sqrt(3);
		
	}
}