package factory;
import shape.*;
import exceptions.*;


public class CircleFactory implements ShapeFactory {
  public Shape create(String... params) {
	  int n = params.length;
	  if (n == 1)
	  {
		  try {
		  double radius = Double.parseDouble(params[0]) ;
		  return new Circle(radius);
		  } 
		  catch (Exception e) {
			 throw new NumberFormatException() ;
		  }
	  }
	  else
		  throw new NotEnoughParamException("required 1 parameter for circle");
  }
} 
