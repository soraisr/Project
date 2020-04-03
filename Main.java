
public class Main {
	  public static double calculate(String... params) { 
		 Shape s = new Shape();
		try {
			s = (Shape) Class.forName(params[0]).newInstance();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 s.setparam(params);
		 return s.calculate() ;
		}
	
 public static void main(String[] args)
 {  
  	if (Main.calculate("Rect", "3", "20") != 60.0) {
        System.out.println("Wrong1");
        return;
      }
      
      if (Math.ceil(Main.calculate("Circle", "5")) != 79.0) {
        System.out.println("Wrong2");
        return;
      }
	  if (Math.ceil(AreaCalculator.calculate("triangle", "10", "15", "20")) != 73.0) {
		 System.out.println("Wrong3");
		 return;
	  }

      
      System.out.println("Good! For now..");
    }
 }

