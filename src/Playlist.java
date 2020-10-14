import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        //can remove the explicit type String on new ArrayList
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("TINA");
        desertIslandPlaylist.add("Neo Seoul");
        desertIslandPlaylist.add("OK time for plan B");
        desertIslandPlaylist.add("Pennyweight");
        desertIslandPlaylist.add("Black Flag");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(2);
        System.out.println(desertIslandPlaylist);

        //swap song order
        int indexA = desertIslandPlaylist.indexOf("Neo Seoul");
        int indexB = desertIslandPlaylist.indexOf("Black Flag");
        String songA = desertIslandPlaylist.get(indexA);
        String songB = desertIslandPlaylist.get(indexB);
        desertIslandPlaylist.set(indexA, songB);
        desertIslandPlaylist.set(indexB, songA);
        System.out.println(desertIslandPlaylist);
    }
}
