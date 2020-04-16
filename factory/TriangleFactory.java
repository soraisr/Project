package factory;
import exceptions.NegativeLengthException;
import exceptions.NotEnoughParamException;
import shape.*;


public class TriangleFactory implements ShapeFactory {
  public Shape create(String... params) {
	  int n = params.length;
	  if (n == 3)
	  {
		  double a = Double.parseDouble(params[0]) ;
		  double b = Double.parseDouble(params[1]) ;
		  double c = Double.parseDouble(params[2]) ; 
		  if (a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a) 
			  return new Triangle(a, b, c);
		  else
			  throw new NegativeLengthException(" required a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a"); 
	  }
	  else
		  throw new NotEnoughParamException("required 3 parameter for triangle");
  }
}
