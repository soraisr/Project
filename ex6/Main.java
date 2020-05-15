package ex6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.*;

public class Main {
	private static Map<String, Shape> shapestype = new HashMap<String, Shape>();
	
	public static double[] str2double(String[] params)
	{	
		int n =params.length ;
		double [] point = new double [n] ;
		try {
			for (int i = 0 ; i < n ; i++)
			{
				point[i] = Double.parseDouble(params[i]);	
			}
		} catch (NumberFormatException e) {
			return points2double(params) ;
		}
		return point;
	}
	
	public static double[] points2double(String[] params)
	{
		  int n = params.length ;
		  if (n == 2)
		  { 
			  double [] point = new double [2*n] ;
			  for (int i = 0 ; i < n ; i++)
			  {	
				  Pattern pattern = Pattern.compile("(\\-*\\d+),\\s(\\-*\\d+)");
				  Matcher matcher = pattern.matcher(params[i]);
				  if (matcher.find())
				  {
					  point[2*i] = Double.parseDouble(matcher.group(1));
					  point[2*i+1] = Double.parseDouble(matcher.group(2));
				  }
				  else
					  throw new NumberFormatException();
			  }
			return point ; 
		  }
		  else 
			  throw new NotEnoughParamException("required 2 parameter for rect");
	    }
	
	public static double calculate(String... params) {
		Shape s = shapestype.get(params[0]);
		return s.calculate(str2double(Arrays.copyOfRange(params, 1, params.length)));
	}
	
	public static void main(String[] args)
	{
		shapestype.put("rect", Shape.rect());
		shapestype.put("circle", Shape.circle());
		shapestype.put("rectByPoints",Shape.rectByPoints());
		shapestype.put("triangle",Shape.triangle());
		shapestype.put("hexagon",Shape.hexagon());
		
		 try {  
		  	if (Main.calculate("rect", "3" ,"20") != 60.0) {
		    System.out.println("Wrong1");
		    return;
		  }
		  
		  if (Math.ceil(Main.calculate("circle", "5")) != 79.0) {
		    System.out.println("Wrong2");
		    return;
		  }
		  if (Math.ceil(Main.calculate("triangle", "10", "15", "20")) != 73.0) {
			 System.out.println("Wrong3");
			 return;
		  }
		  if (Math.ceil(Main.calculate("rectByPoints", "(1, 2)", "(-1, 3)")) != 2.0) {
			 System.out.println("Wrong4");
			 return;
		  }
		    if (Math.ceil(Main.calculate("hexagon", "10")) != 260.0) {
		        System.out.println("Wrong5");
		        return;
		    }
		  System.out.println("Good! For now..");
		 }
		 
		 catch (Exception e) {
			e.printStackTrace();
		 	}

	}
}

