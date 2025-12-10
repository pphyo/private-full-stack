package tech.codoverse;

public class PatternMatchingApp {

	void main() {
		var content = "This is document content.";
		var wordCount = content.split(" ").length;
		var doc = new Document("This is document content.", wordCount);

		if (doc instanceof Document(String t, var c, var wc, var lc) && wordCount > 3 && lc > 2) {
			IO.println("%s%s%d%d".formatted(t, c, wc, lc));
		}
	}

}
