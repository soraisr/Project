import java.lang.reflect.Constructor;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


import shape.*;

public class Main {
	private static Map<String, ShapeFactory> factories = new HashMap<String, ShapeFactory>();
	
	public static double calculate(String... params) throws ClassNotFoundException { 
		try {
			factories.get(params[0]).create(params); // TODO: Find out how to pass params[1..], probably with removeFirst() or something.
		} 
		catch (ClassNotFoundException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		}
		 catch (IllegalAccessException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		
		} catch (IllegalArgumentException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (InvocationTargetException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (NoSuchMethodException e) {
			throw new NotEnoughParamException(" Not enough params recieved "+ (n+1) , e);
		} catch (SecurityException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		}
		}
	

public static void main(String[] args)
 
 {
	factories.put("rect", new RectFactory());
	factories.put("circle", new CircleFactory());
	factories.put("triangle", new TriangleFactory());

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
	  
	  System.out.println("Good! For now..");
	    }
	 catch (Exception e) {
		e.printStackTrace();
	 	}
 }
}
