import java.lang.reflect.InvocationTargetException;

public class Main {
	  public static double calculate(String... params) { 
		 Shape s = new Shape();
		try {
				s = (Shape) Class.forName(params[0]).getDeclaredConstructor(String[].class).newInstance((Object)params);

		} 
		catch (ClassNotFoundException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		}
		 catch (InstantiationException e) {
			 throw new NotExistsShapeException(" Error 404: shape not found", e);
			 
		} catch (IllegalAccessException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		
		} catch (IllegalArgumentException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (InvocationTargetException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (NoSuchMethodException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (SecurityException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		}
		 return s.calculate() ;
		}
	

public static void main(String[] args)
 
 {
	 try {  
	  	if (Main.calculate("Rect", "3", "20") != 60.0) {
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
	
	  
	  System.out.println("Good! For now..");
	    }
	 catch (Exception e) {
		e.printStackTrace();
	 	}
 }
}
