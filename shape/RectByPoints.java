package shape;

public class RectByPoints implements Shap {
   private Rect rect; // This is called Delegation

   public RectByPoints(int[] a, int[] b) {
     this.rect = new Rect(5, 10); // this should be implemented for real some time :)
   }
  
   public double calculate() {
      return rect.calculate();
   }
}
