package shape;

public class RectByPoints implements Shape {
   private Rect rect; // This is called Delegation

   public RectByPoints(double[] a, double[] b) {
	  if (a.length==2 && b.length==2)
		  this.rect = new Rect( Math.abs(a[1]-a[0]),  Math.abs(b[1]-b[0])); // this should be implemented for real some time :)
	  else 
		  this.rect = null ;
   }
  
   public double calculate() {
      return rect.calculate();
   }
}
