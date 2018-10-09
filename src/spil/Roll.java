package spil;

import java.util.Scanner;

public class Roll {
    public static void main(String[] args){
        String[] names = Visual.giveName();

        Player p1 = new Player(names[0]);
        Player p2 = new Player(names[1]);

        Die d1 = new Die();
        Die d2 = new Die();

        //--------------------
        // Starten af spillet
        //--------------------
        do{
            Visual.roundNumber(p1,p2);

            Visual.preRound(p1);
            p1.turn(d1,d2);
            Visual.postRound(p1,d1,d2);

            Visual.preRound(p2);
            p2.turn(d1,d2);
            Visual.postRound(p2,d1,d2);

        }while ((p1.getScore() < 40) && (p2.getScore() < 40));

        Visual.win(p1,p2);
    }
}
