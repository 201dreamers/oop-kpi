import lab6.MusicTrack;
import lab6.PopMusic;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomSet mySet = new CustomSet();
        mySet.add(new PopMusic("Cool song!", 15, "pop"));
        Iterator<MusicTrack> iterator = mySet.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(mySet.contains(new PopMusic("Cool song!", 15, "pop")));
        System.out.println("Done!");
    }
}
