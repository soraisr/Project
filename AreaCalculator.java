
public class AreaCalculator {
	
  public static double calculate(String... params) { 
	  	if (params.length < 2)
	  		return 0 ;
	  	double area = 0 ;
	  	if (params[0].equals("square") && params.length==3 )
	  	{
	  		double height = Integer.parseInt(params[1]) ;
	  		double width = Integer.parseInt(params[2]) ;
	  		area = height*width ; 
	  	}
	  	if (params[0].equals("circle") && params.length==2 )
	  	{
	  		double radius = Integer.parseInt(params[1]) ;
	  		area = Math.pow(radius,2)*Math.PI ; 
	  	}
	  	if (params[0].equals("triangle") && params.length==4 )
	  	{
	  		double a = Integer.parseInt(params[1]) ;
	  		double b = Integer.parseInt(params[2]) ;
	  		double c = Integer.parseInt(params[3]) ;
	  		area =  0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 
	  	}
	  	
	  		
	  	return area;	
	  
  }
  
  public static void main(String[] args) {
	  	if (AreaCalculator.calculate("square", "3", "20") != 60.0) {
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
    
    System.out.println("Good! For now..");
  }
}

