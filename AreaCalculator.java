public class AreaCalculator {
  public static double calculate(String... params) { return 0.0; }
  
  public static void main(String[] args) {
    if (AreaCalculator.calculate("square", "3", "20") != 60.0) {
      System.out.println("Wrong");
      return;
    }
    
    if (Math.ceil(AreaCalculator.calculate("circle", "5")) != 79.0) {
      System.out.println("Wrong");
      return;
    }
    
    if (Math.ceil(AreaCalculator.calculate("triangle", "10", "5", "20")) != 73.0) {
      System.out.println("Wrong");
      return;
    }
    
    System.out.println("Good! For now..");
  }
}
