package spil;

import java.util.Scanner;

public class Roll {
    public static void main(String[] args){
        String[] names = Visual.giveName();

        Player p1 = new Player(names[0]);
        Player p2 = new Player(names[1]);

        Die d1 = new Die();
        Die d2 = new Die();

        do{
            Visual.roundNumber(p1,p2);

            Visual.preRound(p1);

            d1.rul();
            d2.rul();
            p1.setScore((p1.getScore() + d1.getFaceValue() + d2.getFaceValue()));

            Visual.postRound(p1,d1,d2);

            System.out.println();

            Visual.preRound(p2);

            d1.rul();
            d2.rul();

            p2.setScore((p2.getScore() + d1.getFaceValue() + d2.getFaceValue()));

            Visual.postRound(p2,d1,d2);

            System.out.println();

        }while ((p1.getScore() < 40) && (p2.getScore() < 40));

        Visual.win(p1,p2);
    }
}
