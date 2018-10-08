public class Player {
    private int score = 0;
    String name;

    //-----------------------------------------------------------------------------------------
    // Constructor til Player. Når objektet laves gives en String som er navnet til spilleren.
    //-----------------------------------------------------------------------------------------
    public Player(String name){
        this.name = name;
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
}
