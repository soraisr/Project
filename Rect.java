
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
	  		if (height < 0 || width < 0) 
				throw new NegativeLengthException(" required height > 0  width > 0") ;
		} 
		else
			throw new NotEnoughParamException("required 3 params for rect") ;
	}
	
	@Override
	public double calculate()
	{
  			return height*width ; 
	}
}

