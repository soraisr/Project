package factory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.NegativeLengthException;
import exceptions.NotEnoughParamException;
import shape.*;


public class RectFactory implements ShapeFactory {
	@Override
	public String toString()
	{
		return "Rect" ;
	}
  public Shape create(String... params) {
	  int n = params.length ;
	  if (n == 2)
	  { 
		  try {
			  double a = Double.parseDouble(params[0]) ;
			  double b = Double.parseDouble(params[1]) ; 
			  return new Rect(a, b);
		  }
		  catch (Exception e) {	
			  throw new NumberFormatException() ;
		  }
	  }
	  else 
		  throw new NotEnoughParamException("required 2 parameter for rect");	
  }
    	
}
    

