package factory;
import exceptions.NegativeLengthException;
import exceptions.NotEnoughParamException;
import shape.*;


public class TriangleFactory implements ShapeFactory {
  public Shape create(String... params) {
	  int n = params.length;
	  if (n == 3)
	  {
		  try {
			  double a = Double.parseDouble(params[0]) ;
			  double b = Double.parseDouble(params[1]) ;
			  double c = Double.parseDouble(params[2]) ; 
			  return new Triangle(a, b, c);
		  }
		  catch (Exception e) {	
			  throw new NumberFormatException() ;
		  }	
	  }
	  else
		  throw new NotEnoughParamException("required 3 parameter for triangle");
  }
}
