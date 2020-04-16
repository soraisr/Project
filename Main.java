import java.lang.reflect.Constructor;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


import shape.*;

public class Main {
	
	public static Shape function1(Constructor<?> ctor ,double [] inputs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return (Shape) ctor.newInstance(inputs[0]);
	}
	public	static Shape function2(Constructor<?> ctor ,double [] inputs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return (Shape) ctor.newInstance(inputs[0] , inputs [1]);
	}
	public	static Shape function3(Constructor<?> ctor ,double [] inputs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return (Shape) ctor.newInstance(inputs[0] , inputs [1] , inputs [2]);
	}
	
	public static double calaculateByPoints(String... params) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int n = params.length -1 ;
		double [] x_axis = new double [n] ;
		double [] 	y_axis = new double [n] ;
		for (int i = 0 ; i < n ; i++)
		{	
	        Pattern pattern = Pattern.compile("(\\-*\\d+),\\s(\\-*\\d+)");
	        Matcher matcher = pattern.matcher(params[i+1]);
	        if (matcher.find())
	        {
	        x_axis[i] = Double.parseDouble(matcher.group(1));
	        y_axis[i] = Double.parseDouble(matcher.group(2));
	        }
	        else
	        	throw new NumberFormatException();
		}
		Class [] inputArrayType = new Class [2] ;
		inputArrayType[0] =x_axis.getClass();
		inputArrayType[1] =y_axis.getClass() ;
		Constructor<?> ctor = Class.forName("shape." +params[0]).getDeclaredConstructor(inputArrayType) ;
		ctor.setAccessible(true);
		Shape s = (Shape) ctor.newInstance(x_axis , y_axis);
		return s.calculate() ;

	}
	
	
	public static double calculate(String... params) throws ClassNotFoundException, InstantiationException{ 
		int n = params.length -1 ;
		double [] inputs = new double [n] ;
		Class[] ctorArgs = new Class [n] ;
		try {
		for (int i = 0 ; i < n ; i++)
		{
			try {
				inputs[i] = Double.parseDouble(params[i+1]);
			} 
			catch (Exception e) 
			{
					return calaculateByPoints(params);
			}
			ctorArgs[i] = double.class ;
			if (inputs[i]<0)
				throw new NegativeLengthException("the " + i + " input is negative !" ) ;
		}

				Constructor<?> ctor = Class.forName("shape." +params[0]).getDeclaredConstructor(ctorArgs) ;
				ctor.setAccessible(true);
				Class [] inputArrayType = new Class [2] ;
				inputArrayType[0] =ctor.getClass();
				inputArrayType[1] =inputs.getClass() ;
				Object [] inputArray = new Object [2] ;
				inputArray[0] =ctor;
				inputArray[1] =inputs; 
				Shape s = (Shape) Main.class.getMethod("function"+n, inputArrayType ).invoke(null, inputArray) ;
				return s.calculate() ;
	
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
