package pl.marcin.adapter;

public class EBookReader {
    public static void main(String[] args) {
        EBook eBook = new EBook("Jane Austin", "PDF",
                "Romantic novel about love of two stubborn people");
        Book book = new Book("John Crosworth", "How to be happy",
                "5 ways to reach happiness in your life. Bestseller", 2022);
        Newspaper newspaper = new Newspaper("Times", "Daily",
                "Breaking news: Prime minister is happy!", "07/04/2023");

        EbookAdapter eBook1 = new EbookAdapter(book);
        EnewspaperAdapter eNewspaper = new EnewspaperAdapter(newspaper);

        readBook(eBook);
        readBook(eBook1);
        readBook(eNewspaper);

    }

    public static void readBook(ElectronicBook electronicBook) {
        System.out.println("\n-----new position in your reader:-----");
        System.out.println("Your new Book: " + electronicBook.getFileName());
        System.out.println("Format: " + electronicBook.getFileFormat() +
                " is compatible with reader ");
        System.out.println("Ready for reading: " + electronicBook.getFileContent() + "...");

    }
}

