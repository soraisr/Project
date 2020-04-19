package shape;

public class Circle implements Shape {
	private final double radius;
	public Circle(double radius){
		this.radius = radius ;
	}
	
	@Override
	public double calculate()
	{
		return Math.pow(radius,2)*Math.PI ;
	}
}

