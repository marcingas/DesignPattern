package pl.marcin.adapter;

public class Book {
    private String author;
    private String title;
    private String description;
    private int issueYear;

    public Book(String author, String title, String description, int issueYear) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.issueYear = issueYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIssueYear() {
        return issueYear;
    }
}
