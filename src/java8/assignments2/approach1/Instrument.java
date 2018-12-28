package java8.assignments2.approach1;

import java8.helperclasses.Guitar;
import java8.helperclasses.Piano;

public class Instrument implements Piano,Guitar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument instrument =new Instrument();
		instrument.play();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		Guitar.super.play();
		Piano.super.play();
	}

}
