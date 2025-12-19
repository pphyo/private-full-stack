package tech.codoverse;

import java.io.File;
import java.io.IOException;

public class ExceptionCallStack {

	void callFirst() throws IOException {
		calle();
	}

	void callSecond() throws IOException {
		callFirst();
	}

	void callThird() throws IOException {
		callSecond();
	}

	void calle() throws IOException {
		var file = new File("");

		file.createNewFile();
	}

}
