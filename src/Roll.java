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



    }
}
