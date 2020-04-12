package shape;

public class Rect implements Shape {
	private final double height;
	private final double width;

	Rect(double a , double b){
		this.height = a ;
		this.width = b ;
	}

	@Override
	public double calculate() {
  			return height*width ; 
	}
}

