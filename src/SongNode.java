/**
Yakup Bartu Başkaya 
240444051
19.10.2026
 */
public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
