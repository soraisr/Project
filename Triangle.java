
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
		} 
		else
		{
			a = -1 ; 
			b = -1 ;	
			c = -1 ;
		}
	}
	
	@Override
	public double calculate()
	{
		double area = 0 ;
  		if (a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a)
  			area =  0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 
		return area ;
	}
}

