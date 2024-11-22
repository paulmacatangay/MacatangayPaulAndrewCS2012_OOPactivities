package Artist;
public class Singer extends Artist {
    public enum Genre { POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB, SOUL }

    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
