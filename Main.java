import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


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
	
	public static double calculate(String... params) throws ClassNotFoundException { 
		int n = params.length -1 ;
		double [] inputs = new double [n] ;
		Class[] ctorArgs = new Class [n] ; 
		for (int i = 0 ; i < n ; i++)
		{
			inputs[i] = Double.parseDouble(params[i+1]);
			ctorArgs[i] = double.class ;
			if (inputs[i]<0)
				throw new NegativeLengthException("the " + i + " input is negative !" ) ;
		}

		try {
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
	
	  
	  System.out.println("Good! For now..");
	    }
	 catch (Exception e) {
		e.printStackTrace();
	 	}
 }
}
