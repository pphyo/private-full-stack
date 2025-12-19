package tech.codoverse;

public class Hero {

	@Override
	public Hero clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void play() throws IndexOutOfBoundsException {
	}

}

class FighterHer extends Hero {

	@Override
	public void play() throws RuntimeException {

	}

}
