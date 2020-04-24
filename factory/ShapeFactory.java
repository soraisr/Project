
package factory;

import java.io.Serializable;

import shape.Shape;

public interface ShapeFactory extends Serializable  {
	
	public String getName() ;
	Shape create(String... params);
} 

