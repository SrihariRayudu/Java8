package java8.helperclasses;

public interface Guitar {
	default void play() 
    { 
      System.out.println("Guitar Default  Method Executed"); 
      
    }
}
