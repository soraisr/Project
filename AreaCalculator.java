
public class AreaCalculator {
	
	  public static double calculate(String... params) { 
		  	if (params.length < 2)
		  		return 0 ;
		  	double area = 0 ;
		  	if (params[0].equals("square") && params.length==3 )
		  	{
		  		double height = Double.parseDouble(params[1]) ;
		  		double width = Double.parseDouble(params[2]) ;
		  		if (height > 0 && width >0) 
		  			area = height*width ; 
		  	}
		  	if (params[0].equals("circle") && params.length==2 )
		  	{
		  		double radius = Double.parseDouble(params[1]) ;
		  		if (radius > 0)
		  			area = Math.pow(radius,2)*Math.PI ;
		  		
		  	}
		  	if (params[0].equals("triangle") && params.length==4 )
		  	{
		  		double a = Double.parseDouble(params[1]) ;
		  		double b = Double.parseDouble(params[2]) ;
		  		double c = Double.parseDouble(params[3]) ;
		  		if (a > 0 && c > 0 && b > 0 && a + b > c && a + c > b && c + b > a)
		  			area =  0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) ; 
		  	}
		  	if (params[0].equals("hexagon") && params.length==2 )
		  	{
		  		double a = Double.parseDouble(params[1]) ;
		  		if (a > 0)
		  			area = Math.pow(a,2) * 1.5 * Math.sqrt(3);
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
    if (Math.ceil(AreaCalculator.calculate("hexagon", "10")) != 260.0) {
        System.out.println("Wrong4");
        return;
      }
    
    System.out.println("Good! For now..");
  }
}