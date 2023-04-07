package pl.marcin.adapter;

public class Newspaper {
    private String publisher;
    private String title;
    private String content;
    private String issueDate;



    public Newspaper(String publisher, String title,String content, String issueDate) {
        this.publisher = publisher;
        this.title = title;
        this.issueDate = issueDate;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getIssueDate() {
        return issueDate;
    }
}
