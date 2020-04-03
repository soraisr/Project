
public class Main {
	  public static double calculate(String... params) { 
		 Shape s;
		try {
			Class shapeType = Class.forName(params[0]);
			s = (Shape) shapeType.newInstance();
		} catch (ClassNotFoundException e) {
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
  	if (Main.calculate("square", "3", "20") != 60.0) {
        System.out.println("Wrong1");
        return;
      }
      
      if (Math.ceil(Main.calculate("circle", "5")) != 79.0) {
        System.out.println("Wrong2");
        return;
      }

      
      System.out.println("Good! For now..");
    }
 }

