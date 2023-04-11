package pl.marcin.strategy.bookshelf;

public class CrimeBook implements Book{
    private String title;
    private String description;



    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }





    public CrimeBook(String title, String description) {
        this.title = title;
        this.description = description;

    }

    @Override
    public String tellMeAboutBook() {
        return title+" is a  Crime book" +"\nIt is about: " + description;
    }

    @Override
    public String makeImpressionOnReader() {
        return "Grrrr! I'm scared";
    }

    @Override
    public String toString() {
        return "About book: " + tellMeAboutBook() + "\nmy impression about book:" + makeImpressionOnReader();
    }
}
