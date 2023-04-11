package pl.marcin.strategy.bookshelf;

public class ComedyBook implements Book{
    private String title;
    private String description;



    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }





    public ComedyBook(String title, String description) {
        this.title = title;
        this.description = description;


    }

    @Override
    public String tellMeAboutBook() {
        return title+" is a Comedy book. " +"\nIt is about: " + description;
    }

    @Override
    public String makeImpressionOnReader() {
        return "HAHAHAHAHAHA!";
    }

    @Override
    public String toString() {
        return "About book: " + tellMeAboutBook() + "\nmy impression about book:" + makeImpressionOnReader();
    }
}
