
public class Rect extends Shape {
	double height;
	double width;
	Rect(double a , double b){
		this.height = a ;
		this.width = b ;
	}
	Rect(String a , String b){
		this.height = Double.parseDouble(a) ;
		this.width = Double.parseDouble(b) ;
	}
	@Override
	public double calculate()
	{
		double area = 0 ;
  		if (height > 0 && width >0) 
  			area = height*width ; 
		return area ;
	}
}

