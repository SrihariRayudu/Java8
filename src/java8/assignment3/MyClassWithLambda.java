package java8.assignment3;

import java8.helperclasses.WordCount;

public class MyClassWithLambda {// implements WordCount{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassWithLambda myClassWithLambda = new MyClassWithLambda();
		WordCount wordCount = str -> {
			return str.length();
		};
		System.out.println(wordCount.count("ssssssssssssss"));
	}

}
