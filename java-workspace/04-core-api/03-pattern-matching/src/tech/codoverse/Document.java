package tech.codoverse;

public record Document(String title, String content, int wordCount, int lineCount) {

	public Document(String content, int wordCount, int lineCount) {
		this("Default Title", content, wordCount, lineCount);
	}

	public Document(String content, int wordCount) {
		this("Default Title", content, wordCount, 0);
	}

}
