package tech.codoverse;

import java.util.ArrayList;
import java.util.List;

public class GenericApp {

	void main() {
		// List<Object>
		// List<CharSequence>
		// List<String>
		List<? super String> list = new ArrayList<>();
		list.add("Hello");

	}

	void runForMultiTypeParam() {
		Pair<String, Number> pair = new OrderPair<String, Number>();
		IO.println(pair);
	}

	void runForBox() {
		Box<Integer> intBox = new Box<>();
		intBox.setData(10);
		int intData = intBox.getData();
		IO.println(intData);

		var stringBox = new Box<String>();
		stringBox.setData("String box");
		stringBox.inspect(10);
	}

}