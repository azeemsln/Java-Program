public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves();

    }
}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class King implements Chessplayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (one step)");
    }
}

class Sipahi implements Chessplayer {
    public void moves() {
        System.out.println("One step forward.");
    }
}
