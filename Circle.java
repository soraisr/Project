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
		if (params.length == 2)
		{
			this.radius = Double.parseDouble(params[1]);
			if  (radius < 0)
				throw new NegativeLengthException(" required radius > 0") ;
		}
		else 
			throw new NotEnoughParamException("required 2 params for circle") ;	
	}
	@Override
	public double calculate()
	{
		return Math.pow(radius,2)*Math.PI ;
	}
}

