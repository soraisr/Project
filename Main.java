
import exceptions.NotExistsShapeException;
import java.util.Arrays;
import shape.*;

public class Main {

	public static double calculate(String... params) throws ClassNotFoundException { 
		try {
			Shape s =Data.getFactories().get(params[0]).create(Arrays.copyOfRange(params,1, params.length));
			return s.calculate();
		} 
		catch (IllegalArgumentException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (SecurityException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		}
		 catch (NullPointerException e) {
				throw new NotExistsShapeException(" Error 404: shape not found", e);
			}
	}
	

public static void main(String[] args)
 
 {	Data.loadData();
 	PluginLoader.load();
	 try {  
	  	if (Main.calculate("Rect", "3" ,"20") != 60.0) {
	    System.out.println("Wrong1");
	    return;
	  }
	  
	  if (Math.ceil(Main.calculate("Circle", "5")) != 79.0) {
	    System.out.println("Wrong2");
	    return;
	  }
	  if (Math.ceil(Main.calculate("Triangle", "10", "15", "20")) != 73.0) {
		 System.out.println("Wrong3");
		 return;
	  }
	  if (Math.ceil(Main.calculate("RectByPoints", "(1, 2)", "(-1, 3)")) != 2.0) {
		 System.out.println("Wrong4");
		 return;
	  }
	    if (Math.ceil(Main.calculate("Hexagon", "10")) != 260.0) {
	    	System.out.println(Math.ceil(Main.calculate("Hexagon", "10")));
	        System.out.println("Wrong4");
	        return;
	     }
	    
	  System.out.println("Good! For now..");
	    }
	 catch (Exception e) {
		e.printStackTrace();
	 	}
 }
}
