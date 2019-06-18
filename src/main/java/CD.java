import java.util.ArrayList;

public class CD {

    private String name;
    private ArrayList<String> songList;

    public CD(String name, ArrayList<String> songList){
        this.name = name;
        this.songList = songList;
    }

    public String getName(){
        return this.name;
    }

    public String getSong(int trackNumber){
        trackNumber -= 1;
        return songList.get(trackNumber);
    }
}
