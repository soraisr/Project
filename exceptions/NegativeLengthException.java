
package exceptions;
public class NegativeLengthException extends RuntimeException {
    // Parameterless Constructor
    public NegativeLengthException() {

    }
 
  // Constructor that accepts a message
  public  NegativeLengthException(String message)
  {
     super(message);
  }
  public  NegativeLengthException(String message ,Throwable cause)
  {
     super(message , cause );
  }
  public  NegativeLengthException(Throwable cause)
  {
	     super( cause );
  }

}

