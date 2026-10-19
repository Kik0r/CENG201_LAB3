/**
 * Represents the doubly linked list for the music playlist.
 */
public class MusicPlaylist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void removeSong(String title) {
        if (head == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        SongNode temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                    if (current == temp) {
                        current = head;
                    }
                    System.out.println("Removed: " + title);
                    return;
                }

                if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                    if (current == temp) {
                        current = tail;
                    }
                    System.out.println("Removed: " + title);
                    return;
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;

                if (current == temp) {
                    current = (temp.next != null) ? temp.next : temp.prev;
                }

                System.out.println("Removed: " + title);
                return;
            }

            temp = temp.next;
        }

        System.out.println("The song isn't in the playlist");
    }

    public void nextSong() {
        if (current == null) {
            System.out.println("Already at the last song of the playlist.");
            return;
        }

        if (current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    public void previousSong() {
        if (current == null) {
            System.out.println("Already at the first song of the playlist.");
            return;
        }

        if (current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("Current Song: No songs in the playlist");
            return;
        }

        System.out.println("Current Song: " + current.title);
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        StringBuilder playlist = new StringBuilder();
        SongNode temp = head;

        while (temp != null) {
            playlist.append(temp.title);
            if (temp.next != null) {
                playlist.append(" <-> ");
            }
            temp = temp.next;
        }

        if (head != null) {
            playlist.append(" <-> END");
        }

        System.out.println(playlist.toString());
    }
}
