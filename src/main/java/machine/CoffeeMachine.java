package machine;
import java.util.Scanner;

public class CoffeeMachine {
     static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    final static int waterForEspresso = 250;
    final static int beansForEspresso = 16;
    final static int moneyForEspresso = 4;
    final static int waterForLatte = 350;
    final static int milkForLatte = 75;
    final static int beansForLatte = 20;
    final static int moneyForLatte = 7;
    final static int waterForCappuccino = 200;
    final static int milkForCappuccino = 100;
    final static int beansForCappuccino = 12;
    final static int moneyForCappuccino = 6;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "take":
                    Actions.take();
                    break;
                case "fill":
                    Actions.fill();
                    break;
                case "buy":
                    Actions.buy();
                    break;
                case "remaining":
                    Actions.printStatus();
                    break;
                case "exit":
                    return;
            }
        }
    }
}

