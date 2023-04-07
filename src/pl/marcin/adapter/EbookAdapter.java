package pl.marcin.adapter;

public class EbookAdapter implements ElectronicBook{
Book book;

    public EbookAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getFileName() {
        return book.getAuthor() + ": " + book.getTitle();
    }

    @Override
    public String getFileFormat() {
        return "PDF";
    }

    @Override
    public String getFileContent() {
        return book.getAuthor() + ": " + book.getTitle() + "\nissue year: " +book.getIssueYear()+
                "\ncontent: " + book.getDescription();
    }
}
