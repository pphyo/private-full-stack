package tech.codoverse;

public record DocumentDTO(int id, String title, String content, int wordCount) {

    public static DocumentDTO from(DocumentEntity entity) {
        return new DocumentDTO(entity.getId(), entity.getTitle(), entity.getContent(), entity.getWordCount());
    }

}
