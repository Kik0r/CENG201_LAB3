public class MusicPlayerDemo {

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        playlist.addSong("test - test");
        playlist.addSong("testsil - testsil");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();

        System.out.println("\n=== AFTER REMOVING TO SONG ===");
        playlist.removeSong("test - test");
        playlist.displayPlaylist();
        playlist.removeSong("testsil - testsil");
        playlist.displayPlaylist();

    }
}
