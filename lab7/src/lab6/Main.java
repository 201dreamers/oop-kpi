package lab6;

public class Main {
    public static void main(String[] args) {

        MusicAlbum musicAlbum = new MusicAlbum();

        musicAlbum.add(new PopMusic("ShapeOfYou",3, "pop"));
        musicAlbum.add(new ClassicMusic("MoonSonat",5, "classic"));
        musicAlbum.add(new RockMusic("Toxicity", 5, "rock"));
        musicAlbum.add(new ClassicMusic("ToElise",6, "classic"));
        musicAlbum.add(new PopMusic("Decpacito",4, "pop"));
        musicAlbum.add(new RockMusic("IntoTheFire", 4, "rock"));

        System.out.println( "Summary length of all songs in this album - " + musicAlbum.getAllLength());

        musicAlbum.printAlbum();

        musicAlbum.sortAlbum();

        musicAlbum.printAlbum();
    }
}
