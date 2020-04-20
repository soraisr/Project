package shape;

import exceptions.NegativeLengthException;

public class Rect implements Shape {
	private final double height;
	private final double width;

	public Rect(double a , double b){
		this.height = a ;
		this.width = b ;
		 if ( a < 0 || b < 0 )
			  throw new NegativeLengthException(" required height > 0  width > 0");
	}

	@Override
	public double calculate() {
  			return height*width ; 
	}
}

