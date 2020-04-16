package shape;

public class RectByPoints implements Shape {
   private Rect rect; // This is called Delegation

   public RectByPoints(double[] a, double[] b) {
		  this.rect = new Rect( Math.abs(a[1]-a[0]),  Math.abs(b[1]-b[0])); // this should be implemented for real some time :)
   }
   
   public double calculate() {
      return rect.calculate();
   }
}
