
public class Hexagon extends Circle{
	@Override
	public double calculate()
	{
		return  Math.pow(radius,2) * 1.5 * Math.sqrt(3);
	}
}
