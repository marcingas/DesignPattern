package pl.marcin.adapter;

public class NewspaperAdapter implements ElectronicBook{
    Newspaper newspaper;

    public NewspaperAdapter(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public String getFileName() {
        return newspaper.getPublisher();
    }

    @Override
    public String getFileFormat() {
        return "PDF";
    }

    @Override
    public String getFileContent() {
        return "Publisher: " + newspaper.getPublisher() + "\ntitle: " + newspaper.getTitle() + ", issued: " +
                newspaper.getIssueDate() + "\ncontent: " + newspaper.getContent();
    }
}
