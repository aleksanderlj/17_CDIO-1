import java.util.Random;

public class Die {
private int faceValue;



    public void rul() {
        Random r = new Random();
        this.faceValue = r.nextInt(6) + 1;
    }

    public int getFaceValue(){
        return this.faceValue;
    }

}

//Rul - få et tal fra 1-6 (samt tilføj faceValue til Player objekt)
//Getters og setters


//Ekstra!
//Sammenlign - Sammenlign to Die-objekters face-value (hint: this.x == other.x)