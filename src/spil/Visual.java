package spil;

import java.util.Scanner;

public class Visual {
    static int round = 1;
    static Scanner input = new Scanner(System.in);

    //--------------------
    // Viser runde nummer
    //--------------------
    static void roundNumber(Player p1, Player p2){
        System.out.println("---------------------------------");
        System.out.println("            |Runde " + round + "|");
        System.out.println(p1.getName() + " [" + p1.getScore() + "]" + " -VS- " + p2.getName() + " [" + p2.getScore() + "]");
        System.out.println("---------------------------------");
        round++;
    }

    //------------------------------------
    //Spørger om to navne til to spillere
    //------------------------------------
    static String[] giveName(){
        System.out.println("Hvad er spiller 1's navn?");
        String name1 = input.nextLine();
        System.out.println();
        System.out.println("Hvad er spiller 2's navn?");
        String name2 = input.nextLine();

        String[] names = new String[]{name1, name2};

        return names;
    }

    //------------------------------------
    // Fortæller spiller at de skal rulle
    //------------------------------------
    static void preRound(Player p1){
        System.out.println(p1.getName() + " rul");
        input.nextLine();
    }

    //-------------------------------------------------
    //Fortæller spiller hvad de rullede og deres score
    //-------------------------------------------------
    static void postRound(Player p1, Die d1, Die d2){
        System.out.println("Du rullede " + d1.getFaceValue() + " og " + d2.getFaceValue());
        System.out.println(p1.getName() + ", din score er nu [" + p1.getScore() + "]");
        System.out.println();
    }

    //-----------------
    //Finder en vinder
    //-----------------
    static void win(Player p1, Player p2){
        System.out.println("======================");
        if (p2.getScore() < 40)
            System.out.println(p1.getName() + " har vundet!");
        else if (p1.getScore() < 40)
            System.out.println(p2.getName() + " har vundet!");
        else
            System.out.println("I har begge vundet!");
        System.out.println("======================");
    }
}
