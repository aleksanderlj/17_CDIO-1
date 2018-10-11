package spil;

public class Player {
    private int score = 0;
    private String name;
    private boolean hadRound = true;

    //----------------------------------------------------------------------------------------------
    // Constructor til spil.Player. Når objektet laves gives en String som er navnet til spilleren.
    //----------------------------------------------------------------------------------------------
    public Player(String name){
        this.name = name;
    }

    //-------------------------
    //Spiller ruller terninger
    //-------------------------
    public void turn(Die d1, Die d2){
        d1.rul();
        d2.rul();
        this.setScore((this.getScore() + d1.getFaceValue() + d2.getFaceValue()));
        Rules.setRound(!Rules.getRound());
    }

    //---------------------------------------------------------------------------------------------------
    // Spiller ruller terninger og der tjekkes for alle regler. Inklusiv ekstra tur hvis der slås to ens
    //---------------------------------------------------------------------------------------------------
    public void turnAllRules(Die d1, Die d2){
        this.turn(d1, d2);
        Rules.allRules(this, d1, d2);
    }

    //--------------------
    // Getters og setters
    //--------------------
    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getHadRound(){ return this.hadRound; }

    public void setHadRound(boolean hadRound) { this.hadRound = hadRound; }
}
