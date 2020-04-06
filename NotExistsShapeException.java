
public class NotExistsShapeException extends RuntimeException {
	
    // Parameterless Constructor
      public NotExistsShapeException() {
  
    }

    // Constructor that accepts a message
    public  NotExistsShapeException(String message)
    {
       super(message);
    }
    public  NotExistsShapeException(String message ,Throwable cause)
    {
       super(message , cause );
    }
    public  NotExistsShapeException(Throwable cause)
    {
       super(cause);
    }


}
