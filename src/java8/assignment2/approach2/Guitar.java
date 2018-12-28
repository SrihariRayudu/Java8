package java8.assignment2.approach2;

import java8.helperclasses.Piano;

public interface Guitar extends Piano{
	default void play() 
    { 
      System.out.println("Guitar Default  Method Executed"); 
      Piano.super.play();
    }
}
