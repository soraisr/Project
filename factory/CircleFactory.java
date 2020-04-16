package factory;
import shape.*;
import exceptions.*;


public class CircleFactory implements ShapeFactory {
  public Shape create(String... params) {
	  int n = params.length;
	  if (n == 1)
	  {
		  double radius = Double.parseDouble(params[0]) ;
		  if (radius >= 0) 
	  			return new Circle(radius);
		  else
			  throw new NegativeLengthException("required radius > 0"); 
	  }
	  else
		  throw new NotEnoughParamException("required 1 parameter for circle");
  }
}
