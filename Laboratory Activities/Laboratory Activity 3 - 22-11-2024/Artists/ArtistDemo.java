package Artist;
public class ArtistDemo {
    public static void main(String[] args) {
        // Instance of Artist class
        Artist genericArtist = new Artist("Taylor Swift", 33, "Music");
        genericArtist.displayInfo();
        System.out.println();

        // Instance of Singer class
        Singer singer = new Singer("Adele Laurie Blue", 35, Singer.Genre.SOUL);
        singer.displayInfo();
        System.out.println();

        // Instance of Painter class
        Painter painter = new Painter("Vincent van Gogh", 37, Painter.Medium.OIL);
        painter.displayInfo();
        System.out.println();

        // Instance of Writer class
        Writer writer = new Writer("William Shakespeare", 52, Writer.WritingStyle.DRAMA);
        writer.displayInfo();
        System.out.println();

        // Instance of Dancer class
        Dancer dancer = new Dancer("Misty Copeland", 41, Dancer.DanceStyle.BALLET);
        dancer.displayInfo();
    }
}
