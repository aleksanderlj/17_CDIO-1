import java.util.Scanner;

public class Roll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hvad er spiller 1's navn?");
        String name1 = input.nextLine();
        System.out.println();
        System.out.println("Hvad er spiller 2's navn?");
        String name2 = input.nextLine();

        Player p1 = new Player(name1);
        Player p2 = new Player(name2);

        Die d1 = new Die();
        Die d2 = new Die();

        int round=1;
        do{
            System.out.println("---------------------------------");
            System.out.println("Runde " + round);
            System.out.println("---------------------------------");

            System.out.println(p1.getName() + " rul");
            input.nextLine();
            d1.rul();
            d2.rul();

            p1.setScore((p1.getScore() + d1.getFaceValue() + d2.getFaceValue()));
            System.out.println("Du rullede " + d1.getFaceValue() + " og " + d2.getFaceValue());
            System.out.println(p1.getName() + ", din score er nu " + p1.getScore());

            System.out.println();
            System.out.println(p2.getName() + " rul");
            input.nextLine();
            d1.rul();
            d2.rul();

            p2.setScore((p2.getScore() + d1.getFaceValue() + d2.getFaceValue()));
            System.out.println("Du rullede " + d1.getFaceValue() + " og " + d2.getFaceValue());
            System.out.println(p2.getName() + ", din score er nu " + p2.getScore());
            System.out.println();

            round++;
        }while ((p1.getScore() < 40) && (p2.getScore() < 40));

        if (p2.getScore() < 40)
            System.out.println(p1.getName() + " har vundet!");
        else if (p1.getScore() < 40)
            System.out.println(p2.getName() + " har vundet!");
        else
            System.out.println("I har begge vundet!");
    }
}
