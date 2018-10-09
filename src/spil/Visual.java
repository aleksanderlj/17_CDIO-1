package spil;

import java.util.Scanner;

public class Visual {
    private static int round = 1;
    private static Scanner input = new Scanner(System.in);

    //---------------------------------
    // Introduktion uden ekstra regler
    //---------------------------------
    static void intro(){
        System.out.println("|=================================================|\n" +
                "|           VELKOMMEN TIL TERNINGESPIL!           |\n" +
                "|=================================================|\n" +
                "| I dette spil slår to spillere med et sæt tern-  |\n" +
                "| inger og summen af terningernes værdi lægges    |\n" +
                "| til spillerens samlede point.                   |\n" +
                "| Den første spiller til at nå 40 point vinder.   |\n" +
                "|                                                 |\n" +
                "| OBS. Selv hvis spiller 1 vinder, får spiller 2  |\n" +
                "| stadig sin tur, da de ellers ikke har slået     |\n" +
                "| lige mange gange! Spiller 2 har dermed chancen  |\n" +
                "| for at dele sejren med spiller 1!               |\n" +
                "|=================================================|");
        System.out.println("Tryk ENTER for at fortsætte...");
        input.nextLine();
        System.out.println();
    }

    //---------------------------------------------
    // Introduktion til spillet samt ekstra regler
    //---------------------------------------------
    static void introAllRules(){
        System.out.println("|=================================================|\n" +
                           "|           VELKOMMEN TIL TERNINGESPIL!           |\n" +
                           "|=================================================|\n" +
                           "| I dette spil slår to spillere med et sæt tern-  |\n" +
                           "| inger og summen af terningernes værdi lægges    |\n" +
                           "| til spillerens samlede point.                   |\n" +
                           "| Den første spiller til at nå 40 point vinder.   |\n" +
                           "|                                                 |\n" +
                           "| OBS. Selv hvis spiller 1 vinder, får spiller 2  |\n" +
                           "| stadig sin tur, da de ellers ikke har slået     |\n" +
                           "| lige mange gange! Spiller 2 har dermed chancen  |\n" +
                           "| for at dele sejren med spiller 1!               |\n" +
                           "|                                                 |\n" +
                           "|-------------------------------------------------|\n" +
                           "|                     REGLER                      |\n" +
                           "|-------------------------------------------------|\n" +
                           "| 1. Spilleren mister alle sine point, hvis       |\n" +
                           "|    spilleren slår to 1'ere.                     |\n" +
                           "|                                                 |\n" +
                           "| 2. Spilleren får en ekstra tur, hvis spilleren  |\n" +
                           "|    slår to ens.                                 |\n" +
                           "|                                                 |\n" +
                           "| 3. Spilleren vinder spillet, hvis spilleren     |\n" +
                           "|    slår to 6'ere i denne tur, men også slog to  |\n" +
                           "|    6'ere i forrige tur.                         |\n" +
                           "|                                                 |\n" +
                           "| 4. Spilleren skal slå to ens for at vinde spil- |\n" +
                           "|    let, efter man har opnået 40 point           |\n" +
                           "|=================================================|");
        System.out.println("Tryk ENTER for at fortsætte...");
        input.nextLine();
        System.out.println();
    }

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
