package pl.marcin.strategy.bookshelf;

import java.util.ArrayList;
import java.util.List;

public class BookshelfRunner {


    public static void main(String[] args) {
        List<Book> bookshelf = new ArrayList<>();
        putOnBookshelf(bookshelf, new CrimeBook("The Killer", "it is scarry crime book about killer"));
        putOnBookshelf(bookshelf, new ComedyBook("A cat on the roof", "very Funny book about a Cat"));
        putOnBookshelf(bookshelf, new Biography("Queen ELisabeth",
                "interesting book about life of Queen of England"));
        reviewBookshelf(bookshelf);

    }

    public static void reviewBookshelf(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void putOnBookshelf(List<Book> bookShelf, Book book) {
        bookShelf.add(book);
    }
}
