package lesson_3;

public class Tests {
    public static void main(String[] args) {
        newObjectTest();
    }

    private static void newObjectTest() {
        MusicPlayer player = new MusicPlayer();
        System.out.println(player.getTrackList());
        player.volumeUp();
        System.out.println(player.getVolume());
    }
}
