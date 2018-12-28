package java8.helperclasses;

public interface Piano {
	default void play() 
    { 
      System.out.println(" Piano Default Method Executed"); 
    } 
}
