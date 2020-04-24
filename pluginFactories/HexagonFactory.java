package pluginFactories;
import shape.*;

import java.io.Serializable;

import exceptions.*;
import factory.ShapeFactory;
import pluginShapes.Hexagon;


public class HexagonFactory implements ShapeFactory ,Serializable  {

	
	private static final long serialVersionUID = 1L;
	public String  getName()
	{
		return "Hexagon" ;
	}
  public Shape create(String... params) {
	  int n = params.length;
	  if (n == 1)
	  {
		  try {
		  double radius = Double.parseDouble(params[0]) ;
		  return new Hexagon(radius);
		  } 
		  catch (Exception e) {
			 throw new NumberFormatException() ;
		  }
	  }
	  else
		  throw new NotEnoughParamException("required 1 parameter for Hexagon");
  }
} 