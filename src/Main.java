import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("How many dice would you like to roll: ");
        numOfDice = scanner.nextInt();
        
        if(numOfDice > 0) {
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.println("you rolled a " + roll);
                System.out.println();
                total += roll;
            }
            System.out.println("Total" + total);
        } else {
            System.out.println("Number of dice rolled must be higher than 0");
        }

        scanner.close();
    }

    private static void printDice(int roll) {
        String dice1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------""";
        String dice2 = """
                 ---------
                | ●       |
                |         |
                |       ● |
                 ---------""";
        String dice3 = """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------""";
        String dice4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------""";
        String dice5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------""";
        String dice6 = """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------""";

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
