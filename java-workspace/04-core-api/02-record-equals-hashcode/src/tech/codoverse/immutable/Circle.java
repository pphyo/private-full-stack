package tech.codoverse.immutable;

public final class Circle {

	private final double radius;

	public Circle(final double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "toString() " + super.toString();
	}

}
