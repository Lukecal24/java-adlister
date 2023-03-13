import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        // Instantiate some albums
        Album album1 = new Album(1, "The Beatles", "Abbey Road", 1969, 12.0, "Rock");
        Album album2 = new Album(2, "Michael Jackson", "Thriller", 1982, 66.0, "Pop");

        // Instantiate some authors
        Author author1 = new Author(1, "J.K. Rowling");
        Author author2 = new Author(2, "Stephen King");

        // Instantiate some quotes
        Quote quote1 = new Quote(1, "It does not do to dwell on dreams and forget to live.", "J.K. Rowling");
        Quote quote2 = new Quote(2, "Get busy living or get busy dying.", "Stephen King");

        // Print out some information about the objects
        System.out.println("Artist: " + album1.getArtist() + " - " + "Album: " + album1.getName() + " (" + album1.getReleaseDate() + ")");
        System.out.println("Artist: " + album2.getArtist() + " - " + "Album: " + album2.getName() + " (" + album2.getReleaseDate() + ")");

        System.out.println("Author: " + author1.getName());
        System.out.println("Author: " + author2.getName());

        System.out.println("\"" + quote1.getText() + "\" - " + quote1.getAuthor());
        System.out.println("\"" + quote2.getText() + "\" - " + quote2.getAuthor());

        Quote quote3 = new Quote(3, "Give you my trust it's the lottery", "Lucki");
        Quote quote4 = new Quote(4, "All black fit, that's the perfect attire.", "Destroy Lonely");

        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(quote3, quote4));

        for (Quote quote : quotes) {
            System.out.println("\"" + quote.getText() + "\" - " + quote.getAuthor());
        }
    }
}
