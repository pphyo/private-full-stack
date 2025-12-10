package tech.codoverse.data;

// final feild in header component
// public accessor
// constructor
// implementation of equals and hashCode
// overriding toString
public record Point(int x, int y) {

	public Point() {
		this(10, 20);
	}

	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result * x;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		return true;
	}

}
