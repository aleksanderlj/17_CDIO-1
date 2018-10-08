import java.util.Random;

public class Die {
private int faceValue;

    //---------------
    //Ruller terning
    //---------------
    public void rul() {
        Random r = new Random();
        this.faceValue = r.nextInt(6) + 1;
    }



    //-------------------
    //Getters og setters
    //-------------------
    public int getFaceValue(){
        return this.faceValue;
    }

}

//Rul - få et tal fra 1-6 (samt tilføj faceValue til Player objekt)
//Getters og setters


//Ekstra!
//Sammenlign - Sammenlign to Die-objekters face-value (hint: this.x == other.x)