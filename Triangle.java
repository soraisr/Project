
public class Triangle extends Shape {
	double a;
	double b; 
	double c;
	Triangle(double a , double b , double c){
		this.a = a ;
		this.a = b ;
		this.c = c ;
	}
	Triangle(String a , String b ,String c){
		this.a = Double.parseDouble(a) ;
		this.b = Double.parseDouble(b) ;
		this.c = Double.parseDouble(c) ;
	}
	Triangle(){
	}
	@Override
	public void setparam(String... params) {
		if (params.length == 4) {
			a = Double.parseDouble(params[1]);
			b = Double.parseDouble(params[2]);
			c = Double.parseDouble(params[3]);
			boolean x = (a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a);
			if (x == false) // should I separate it for 2 conditions (non negative and validation)?
				throw new NegativeLengthException("A triangle is valid if sum of its two non negative sides is greater than the third non negative side" ) ;		
		} 
		else
			throw new NotEnoughParamException("required 4 params for triangle") ;
	}
	
	@Override
	public double calculate()
	{
  			return  0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 

	}
}

