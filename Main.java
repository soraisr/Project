import java.lang.reflect.Constructor;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;

import exceptions.NotExistsShapeException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
import factory.*;
import shape.*;

public class Main {
	private static Map<String, ShapeFactory> factories = new HashMap<String, ShapeFactory>();
	public static double calculate(String... params) throws ClassNotFoundException { 
		try {
			Shape s =factories.get(params[0]).create(Arrays.copyOfRange(params,1, params.length));
			return s.calculate();
		} 
		catch (IllegalArgumentException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		} catch (SecurityException e) {
			throw new NotExistsShapeException(" Error 404: shape not found", e);
		}
	}
	

public static void main(String[] args)
 
 {
	factories.put("Rect", new RectFactory());
	factories.put("RectByPoints",new RectByPointsFactory());
	factories.put("Circle", new CircleFactory());
	factories.put("Triangle", new TriangleFactory());
	factories.put("Hexagon", new HexagonFactory());
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
