package factory;

public class TriangleFactory implements ShapeFactory {
  Shape create(String... params) {
    // TODO: Do some parameter checking here and throw appropriate exceptions
    return new Rect(Double.parseDouble(params[0]), Double.parseDouble(params[1]), Double.parseDouble(params[2]);
  }
}
