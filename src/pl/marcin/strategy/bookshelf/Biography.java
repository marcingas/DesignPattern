package pl.marcin.strategy.bookshelf;

public class Biography implements Book{
    private String title;
    private String description;



    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }





    public Biography(String title, String description) {
        this.title = title;
        this.description = description;

    }

    @Override
    public String tellMeAboutBook() {
        return title+" is a  Biography book." +"\nIt is about: " + description;
    }

    @Override
    public String makeImpressionOnReader() {
        return "Wow! I didn't knew it! ";
    }

    @Override
    public String toString() {
        return "About book: " + tellMeAboutBook() + "\nmy impression about book:" + makeImpressionOnReader();
    }
}
