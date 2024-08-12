import java.util.*;

class Guesser {
    int guessNum;

    int guessNumFromGusser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! Enter a number.");
        guessNum = sc.nextInt();

        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessNumFromPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! Enter a number.");
        guessNum = sc.nextInt();

        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumFromGusser();
    }
    void collectFfromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessNumFromPlayer();
        numFromPlayer2=p2.guessNumFromPlayer();
        numFromPlayer3=p3.guessNumFromPlayer();
    }

    void compare(){
        if(numFromGuesser==numFromPlayer1){
            System.out.println("Player 1 won.");
        }
        if(numFromGuesser==numFromPlayer2){
            System.out.println("Player 2 won.");
        }
        if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 won.");
        }
        if(numFromPlayer1!=numFromGuesser && numFromGuesser!=numFromPlayer2 && numFromGuesser!=numFromPlayer3){
            System.out.println("you all are lose.");
        }
    }
}



public class GuesserGame {


    public static void main(String[] args) {
        Umpire u=new Umpire();
        u.collectFromGuesser();
        u.collectFfromPlayer();
        u.compare();
    }
}
