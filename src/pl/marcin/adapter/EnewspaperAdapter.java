package pl.marcin.adapter;

public class EnewspaperAdapter implements ElectronicBook{
    Newspaper newspaper;

    public EnewspaperAdapter(Newspaper newspaper) {
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
