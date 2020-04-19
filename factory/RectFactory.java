package factory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.NegativeLengthException;
import exceptions.NotEnoughParamException;
import shape.*;


public class RectFactory implements ShapeFactory {
  public Shape create(String... params) {
	  int n = params.length ;
	  if (n == 2)
    {
		  try {
		  double a = Double.parseDouble(params[0]) ;
		  double b = Double.parseDouble(params[1]) ;
		  if (a > 0 && b > 0) 
			  return new Rect(a, b);
		  else
			  throw new NegativeLengthException(" required height > 0  width > 0"); 
		  }
		  catch (Exception e) {
			  double [] x_axis = new double [n] ;
			  double [] 	y_axis = new double [n] ;
			  for (int i = 0 ; i < n ; i++)
			  {	
				  Pattern pattern = Pattern.compile("(\\-*\\d+),\\s(\\-*\\d+)");
				  Matcher matcher = pattern.matcher(params[i]);
				  if (matcher.find())
				  {
					  x_axis[i] = Double.parseDouble(matcher.group(1));
					  y_axis[i] = Double.parseDouble(matcher.group(2));
				  }
				  else
					  throw new NumberFormatException();
			  }
			  return new RectByPoints(x_axis,y_axis) ;
		  }
    	
	}
	  else 
		  throw new NotEnoughParamException("required 2 parameter for rect");
    }
    
  }
    

