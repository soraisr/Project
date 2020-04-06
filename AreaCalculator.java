
public class AreaCalculator {
	
	  public static double calculate(String... params) {
		  	if (params.length < 2)
		  		throw new NotEnoughParamException("less then 2 params") ;
		  
		  	if (params[0].equals("rect"))
		  	{
		  		if(params.length==3)
		  		{
		  			double height = Double.parseDouble(params[1]) ;
		  			double width = Double.parseDouble(params[2]) ;
		  			if (height > 0 && width >0) 
		  				return height*width ;
		  			else 
		  				throw new NegativeLengthException(" needed height > 0  width > 0") ;
		  		}
		  		else 
		  			throw new NotEnoughParamException("needed 3 params for rect") ;
		  	
		  	}
		  	if (params[0].equals("circle"))
		  	{
		  		if (params.length==2 )
		  		{
		  			double radius = Double.parseDouble(params[1]) ;
		  			if (radius > 0)
		  				return Math.pow(radius,2)*Math.PI ;
		  			else 
		  				throw new NegativeLengthException(" needed radius > 0") ;
		  		}
		  		else 
		  			throw new NotEnoughParamException("needed 2 params for circle") ;	
		  	}

		  	if (params[0].equals("triangle") )
		  	{		
		  		if(params.length==4 )
		  		{
		  			double a = Double.parseDouble(params[1]) ;
		  			double b = Double.parseDouble(params[2]) ;
		  			double c = Double.parseDouble(params[3]) ;
		  			if (a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a)
		  				return 0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 
		  			else throw new NegativeLengthException("required a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a" ) ;
		  		}
		  		else 
		  			throw new NotEnoughParamException("required 4 params for triangle") ;
		  	}
		  	
		  	else 
		  		throw new NotEnoughParamException("404 : shape not found " );
		  	
		  		
	  }
	  
	  public static void main(String[] args) {
	try {
			if (AreaCalculator.calculate("rect" , "30" , "2") != 60.0) {
				System.out.println("Wrong1");
				return;
			}
			if (Math.ceil(AreaCalculator.calculate("circle", "5")) != 79.0) {
				System.out.println("Wrong2");
				return;
		    }
		    
		    if (Math.ceil(AreaCalculator.calculate("triangle", "10", "15", "20")) != 73.0) {
		      System.out.println("Wrong3");
		      return;
		    }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
	    System.out.println("Good! For now..");
	  }  
}