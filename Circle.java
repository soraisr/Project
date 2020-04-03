public class Circle extends Shape {
	double radius;
	Circle(double radius){
		this.radius = radius ;
	}
	Circle(String radius){
		this.radius = Double.parseDouble(radius) ;
	}
	Circle(){
		
	}
	@Override
	public void setparam(String... params) {
		this.radius = Double.parseDouble(params[1]);
		if (radius < 0)
			radius = 0 ;
	}
	@Override
	public double calculate()
	{
		double area = Math.pow(radius,2)*Math.PI ;
		return area ;
	}
}

