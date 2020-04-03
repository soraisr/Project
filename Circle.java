
public class Circle extends Shape {
	double radius;
	Circle(double radius){
		this.radius = radius ;
	}
	Circle(String radius){
		this.radius = Double.parseDouble(radius) ;
	}
	@Override
	public void setparam(String... params) {
		this.radius = Double.parseDouble(params[1]);
		if (this.radius < 0)
			this.radius = 0 ;
	}
	@Override
	public double calculate()
	{
		double area = Math.pow(radius,2)*Math.PI ;
		return area ;
	}
}

