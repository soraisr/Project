
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
	Rect(){

	}
	@Override
	public void setparam(String... params) {
		if (params.length == 3) {
		height = Double.parseDouble(params[1]);
		width = Double.parseDouble(params[2]);
		} 
		else
		{
			height = -1 ; 
			width = -1 ;	
		}
	}
	
	@Override
	public double calculate()
	{
		double area = -1 ;
  		if (height >= 0 && width >= 0) 
  			area = height*width ; 
		return area ;
	}
}

