package tech.codoverse;

public class Box<T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public <U extends Number> void inspect(U u) {
		IO.println("U: " + u.getClass().getName());
		IO.println("T: " + data.getClass().getName());
	}

}
