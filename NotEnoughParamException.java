
public class NotEnoughParamException extends RuntimeException {
	
	      // Parameterless Constructor
	        public NotEnoughParamException() {
	    
	      }

	      // Constructor that accepts a message
	      public  NotEnoughParamException(String message)
	      {
	         super(message);
	      }
	      public   NotEnoughParamException(String message ,Throwable cause)
	      {
	         super(message , cause );
	      }
	      public   NotEnoughParamException(Throwable cause)
	      {
	         super( cause );
	      }
}