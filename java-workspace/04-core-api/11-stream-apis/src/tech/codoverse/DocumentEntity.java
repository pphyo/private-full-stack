package tech.codoverse;

public class DocumentEntity {

    private int id;
    private String title;
    private String content;
    private int wordCount;

    public DocumentEntity() {
    }

    public DocumentEntity(int id, String title, String content, int wordCount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.wordCount = wordCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {
        return "DocumentEntity[id=" + id + ", title=" + title + ", content=" + content + ", wordCount=" + wordCount
                + "]";
    }

}
