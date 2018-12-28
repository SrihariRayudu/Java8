package java8.assignment2.approach2;


public class Instrument implements Guitar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument instrument =new Instrument();
		instrument.play();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		Guitar.super.play();
		
	}

}
