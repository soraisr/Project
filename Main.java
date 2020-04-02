
public class Main {
	  public static double calculate(String... params) { 
		  	if (params.length < 2)
		  		return 0 ;
		  	Shape s = new Shape() ;
		  	if (params[0].equals("square") && params.length==3 )
		  	{
		  		s = new Rect(params[1],params[2]);
		  	}
		  	if (params[0].equals("circle") && params.length==2 )
		  	{
		  		s = new Circle(params[1]);
		  	}
		  	return s.calculate() ;
	  }
	
 public static void main(String[] args)
 {  
  	if (Main.calculate("square", "3", "20") != 60.0) {
        System.out.println("Wrong1");
        return;
      }
      
      if (Math.ceil(Main.calculate("circle", "5")) != 79.0) {
        System.out.println("Wrong2");
        return;
      }

      
      System.out.println("Good! For now..");
    }
 }

