public class Circle extends Shape {
	double radius;
	Circle(double radius){
		this.radius = radius ;
	}
	Circle(String ...param) {
		if (param.length == 2)
		{
			this.radius = Double.parseDouble(param[1]);
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

