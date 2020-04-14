package factory;

public class RectFactory implements ShapeFactory {
  Shape create(String... params) {
    // TODO: Do some parameter checking here and throw appropriate exceptions
    return new Rect(Double.parseDouble(params[0]));
  }
}
