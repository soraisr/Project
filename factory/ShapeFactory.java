
package factory;

import shape.Shape;

public interface ShapeFactory {
  Shape create(String... params);
} 

