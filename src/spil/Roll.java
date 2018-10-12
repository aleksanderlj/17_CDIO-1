//******************************************************************
//  Roll.java        Author: Gruppe 17
//
//  Initialiserer objekter til at køre terningespillet samt kører
//  terningespillet
//******************************************************************

package spil;

import java.util.Scanner;

public class Roll {
    public static void main(String[] args){
        Visual.introAllRules();
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

            if (Rules.getRound()) {
                Visual.preRound(p1);
                p1.turnAllRules(d1, d2);
                Visual.postRound(p1, d1, d2);
            }

            else {
                Visual.preRound(p2);
                p2.turnAllRules(d1, d2);
                Visual.postRound(p2, d1, d2);
            }

        }while (((p1.getScore() < 40) && (p2.getScore() < 40) || !Rules.getRound()));

        Visual.win(p1,p2);
    }
}

//For at skifte mellem spillet med og uden regler skal alle Player.turn laves om til Player.turnAllRules
//og Visual.intro() skal skiftes til Visual.introAllRules. Eller omvendt...