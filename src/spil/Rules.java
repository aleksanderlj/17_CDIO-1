package spil;

public class Rules {
    private static boolean doubleSix = false;
    private static boolean round = true;
    private static boolean extraTurnsOn = true;

    //-----------------------------------------------
    // Hvis spiller slår to ens får de en ekstra tur
    //-----------------------------------------------
    public static void extraTurn(Player p1, Die d1, Die d2){
        if ((d1.getFaceValue() == d2.getFaceValue()) && extraTurnsOn){
            round = !round;
            p1.setHadRound(false);
            System.out.println("Du slog to ens! Du får en ekstra tur!");
        }
    }

    //-----------------------------------------------------
    // Hvis spilleren slår to 1'ere, mister de deres point
    //-----------------------------------------------------
    public static void losePoints(Player p1, Die d1, Die d2){
        if (((d1.getFaceValue() == 1) && (d1.getFaceValue() == d2.getFaceValue()))){
            p1.setScore(0);
            System.out.println("Du slog to 1'ere, så du mister alle dine point");
        }
    }

    //------------------------------------------------------------------------
    // Hvis spilleren slår to 6'ere to gange i træk, vinder han med det samme
    //------------------------------------------------------------------------
    public static void instantWin(Player p1, Die d1, Die d2){
        if (((d1.getFaceValue() == 6) && (d1.getFaceValue() == d2.getFaceValue()) && doubleSix)){
            p1.setScore(40);
            System.out.println("Du slog to 6'ere to gange i træk! Du vinder!");
        }
        else if (((d1.getFaceValue() == 6) && (d1.getFaceValue() == d2.getFaceValue())))
            doubleSix = true;
    }

    //-------------------------------------------------------------------------
    // Efter spilleren har fået over 40 point, skal de slå to ens for at vinde
    //-------------------------------------------------------------------------
    public static void delayedWin(Player p1, Die d1, Die d2){
        if (((d1.getFaceValue() != d2.getFaceValue()) && (p1.getScore() >= 40))){
            p1.setScore(39);
            System.out.println("Du har nået 40 point! Men for at vinde skal du først slå to ens!");
        }
        else if (((d1.getFaceValue() == d2.getFaceValue()) && (p1.getScore() > 40)))
            extraTurnsOn = false;
    }

    //--------------------------------------
    // Samling af alle regler til én metode
    //--------------------------------------
    public static void allRules(Player p1, Die d1, Die d2){
        losePoints(p1, d1, d2);
        instantWin(p1, d1, d2);
        delayedWin(p1, d1, d2);
        extraTurn(p1, d1, d2);
    }

    //--------------------
    // Getters og setters
    //--------------------
    public static boolean getRound(){
        return round;
    }

    public static void setRound(boolean n){
        round = n;
    }
}
