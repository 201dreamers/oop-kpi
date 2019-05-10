import java.util.Arrays;
import java.util.Comparator;


public class MusicAlbum {
    private static int MAX_VAL_OF_TRACKS_IN_ALBUM = 12;
    private MusicTrack[] musicTracks = new MusicTrack[MAX_VAL_OF_TRACKS_IN_ALBUM];
    private int counter;

    public void add(MusicTrack musicTrack){
        musicTracks[counter] = musicTrack;
        counter++;
    }


    public int getAllLength() {
        int result = 0;
        for (MusicTrack musicTrack : musicTracks) {
            if (musicTrack != null) result += musicTrack.getLength();
        }
        return result;
    }

    public void sortAlbum(){
        MusicTrack[] buffMusicTracks = new MusicTrack[counter];
        for (int i = 0; i < counter; i++) {
            if (musicTracks[i] != null){
                buffMusicTracks[i] = musicTracks[i];
            }
        }
        Arrays.sort(buffMusicTracks, Comparator.comparing(MusicTrack::getStyleName));
        musicTracks = buffMusicTracks;
    }

    public void printAlbum(){
        System.out.println("============Album=============");
        for (MusicTrack musicTrack : musicTracks) {
            if (musicTrack != null ) System.out.println("Name - " + musicTrack.getName() + "\tLength - " + musicTrack.getLength() + "\t Style - " + musicTrack.getStyleName());
        }
        System.out.println("==============================");
    }
}
