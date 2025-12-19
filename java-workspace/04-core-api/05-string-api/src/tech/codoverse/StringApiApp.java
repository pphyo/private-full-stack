package tech.codoverse;

public class StringApiApp {

	void main() {
		runForStringPool();
	}

	void runForStringPool() {
		var x = "Hello World";
		var y = new String("Hello World").intern();
		IO.println(x == y);
		IO.println(x.hashCode());
		IO.println(y.hashCode());

		var first = "rat" + 1;
		var second = "r" + "a" + "t" + "1";
		var third = "r" + "a" + "t" + new String("1");

		IO.println(first == second);
		IO.println(first == second.intern());
		IO.println(first == third);
		IO.println(first == third.intern());
	}

	void runForSb() {
		StringBuilder sb = new StringBuilder();
		IO.println(sb.capacity());
		sb.append("Hello");
		sb.append(" Java Deveveloper!");
		IO.println(sb);
	}

	void runForTextBlock() {
		String paragraph = """
				The indent() method adds the same number of blank spaces to the
				beginning of each line if you pass a positive number. If you pass a
				negative number, it tries to remove that number of whitespace
				characters from the beginning of the line. If you pass zero, the
				indentation will not change.""";
		IO.println(paragraph.indent(4));
		// IO.println(paragraph.stripIndent());
	}

	void runForString() {
		// String s = "Hello";
		// IO.println(s);
		// s = s.concat(" World!"); // Hello World!
		// IO.println(s);

		String text = "animals";
		IO.println(text.substring(3, 6));
		IO.println(text.stripIndent());

	}

}