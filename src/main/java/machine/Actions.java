package machine;

import static machine.CoffeeMachine.*;

public class Actions {

    public static void printStatus() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println(money + " of money");
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        water = water + addWater;
        System.out.println("Write how many ml of milk you want to add:" );
        int addMilk = scanner.nextInt();
        milk = milk + addMilk;
        System.out.println("Write how many grams of coffee beans you want to add");
        int addBeans = scanner.nextInt();
        beans = beans + addBeans;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        cups = cups + addCups;
    }

    public static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                if (water >= waterForEspresso & beans >= beansForEspresso) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= waterForEspresso;
                    beans -= beansForEspresso;
                    money += moneyForEspresso;
                    cups--;
                } else if (water < waterForEspresso) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < beansForEspresso) {
                    System.out.println("Sorry, not enough beans!");
                }
                break;
            case "2":
                if (water >= waterForLatte & beans >= beansForLatte & milk >= milkForLatte) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= waterForLatte;
                    milk -= milkForLatte;
                    beans -= beansForLatte;
                    money += moneyForLatte;
                    cups--;
                } else if (water < waterForLatte) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < beansForLatte) {
                    System.out.println("Sorry, not enough beans!");
                } else if (milk < milkForLatte) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
            case "3":
                if (water >= waterForCappuccino & beans >= beansForCappuccino & milk >= milkForCappuccino) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= waterForCappuccino;
                    milk -= milkForCappuccino;
                    beans -= beansForCappuccino;
                    money += moneyForCappuccino;
                    cups--;
                } else if (water < waterForCappuccino) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < beansForCappuccino) {
                    System.out.println("Sorry, not enough beans!");
                } else if (milk < milkForCappuccino) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
            case "back":
                return;
        }
    }
}
