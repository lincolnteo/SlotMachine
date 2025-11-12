import java.util.Random;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Random gen = new Random(); //random generator
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fruit Slot Machine!");
        System.out.println("Menu:");
        System.out.println("1.Play 2.Rules 3.Bahasa Melayu Version 4. Mandarin Version 5. Exit");

        int userinput = input.nextInt();

        if (userinput == 1) {// if statements enable user to navigate the menu
            slotEnglish();//execute method
        } else if (userinput == 2) {
            rulesMethod();//execute method
        } else if (userinput == 3) {
            slotMelayu();//execute method
        } else if (userinput == 4) {
            slotMandarin();//execute method
        } else if (userinput == 5) {
            input.close();//execute method
        } else {
            menuRules();//execute method
        }
    }

    public static void rulesMethod() {
        System.out.println("All bets are €5");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF52", "\uD83C\uDF52", " X ", "5 POINTS");// used stringformat to print out
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF52", "\uD83C\uDF52", "\uD83C\uDF52", "7 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF49", " X ", " X ", "6 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF49", "\uD83C\uDF49", " X ", "8 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF49", "\uD83C\uDF49", "\uD83C\uDF49", "9 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83D\uDFE0", " X ", " X ", "10 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83D\uDFE0", "\uD83D\uDFE0", " X ", "15 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83D\uDFE0", "\uD83D\uDFE0", "\uD83D\uDFE0", "20 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF47", " X ", " X ", "15 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF47", "\uD83C\uDF47", " X ", "25 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF47", "\uD83C\uDF47", "\uD83C\uDF47", "50 POINTS");
        System.out.printf("| %-12s | %-10s | %-5s | %2s | \n", "\uD83C\uDF4C", "\uD83C\uDF4C", "\uD83C\uDF4C", "300 POINTS JACKPOT!");
        menuRules();// execute a menu method so code will not break
    }// rules and payout rules set

    public static String slotLane(int lane) {// random generator for the slot lane. there diffrent amount of symbols to increase and decrease the odds
        String lane1 = " ";
        switch (lane) {// with switch loops enables the code to generate sysmbols with random generator
            case 1:
                lane1 = "\uD83C\uDF52";// Cherry
                break;
            case 2:
                lane1 = "\uD83C\uDF52";// Cherry
                break;
            case 3:
                lane1 = "\uD83C\uDF52";// Cherry
                break;
            case 4:
                lane1 = "\uD83C\uDF52";// Cherry
                break;
            case 5:
                lane1 = "\uD83C\uDF52";// Cherry
                break;
            case 6:
                lane1 = "\uD83C\uDF49";// Watermelon
                break;
            case 7:
                lane1 = "\uD83C\uDF49";// Watermelon
                break;
            case 8:
                lane1 = "\uD83C\uDF49";// Watermelon
                break;
            case 9:
                lane1 = "\uD83C\uDF49";// Watermelon
                break;
            case 10:
                lane1 = "\uD83D\uDFE0";// Orange
                break;
            case 11:
                lane1 = "\uD83D\uDFE0";// Orange
                break;
            case 12:
                lane1 = "\uD83D\uDFE0";// Orange
                break;
            case 13:
                lane1 = "\uD83C\uDF47";// Grape
                break;
            case 14:
                lane1 = "\uD83C\uDF47";// Grape
                break;
            case 15:
                lane1 = "\uD83C\uDF4C";// Banana
                break;
        }
        return lane1;
    }//slot lane ramdom

    public static void slotEnglish() {
        Random gen = new Random(); //random generator
        Scanner input = new Scanner(System.in);
        System.out.println("you will begin with €100, Good Luck Have Fun!");
        System.out.println("€5 Bets");
        int usercredits = 100;
        System.out.println("You curruntly have:€100");

        do {
            System.out.println("Menu");
            System.out.println("1.Play 2.Exit");
            System.out.println("Enter 1 to play");
            int userinput1 = input.nextInt();
            if (userinput1 == 1) {
                usercredits = usercredits - 5;// if user input 1 which is play it will deduct 5 credits from the total as 5 credits is the bets
            } else if (userinput1 == 2) {// if user input 2 it will exit the code
                input.close();
            } else {//if user input is invalid the code will run the method once again
                System.out.println("Invalid input please try again");
                slotEnglish();
            }


            int lane1 = gen.nextInt(15) + 1;// randome generator with the slotlane methods
            int lane2 = gen.nextInt(15) + 1;
            int lane3 = gen.nextInt(15) + 1;

            String laneA, laneB, laneC;

            laneA = slotLane(lane1);
            laneB = slotLane(lane2);
            laneC = slotLane(lane3);

            System.out.println("-----------------------------");
            System.out.printf("%-12s%-10s%5s\n", laneA, laneB, laneC);// used stringformat to print
            System.out.println("-----------------------------");

            if (laneA == "\uD83C\uDF52" && laneB == "\uD83C\uDF52" && laneC == "\uD83C\uDF52") {// used if statement to evaluate if it is a win or lost and different winning amount and patterns
                int reward = (7);// winning amount
                usercredits += reward;// if user got this specific pattern code will add the winning amount to the usercredits
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);//out prints winnings
                System.out.println("You currently have: €" + usercredits);// print total credits in balance
            } else if (laneA == "\uD83C\uDF52" && laneB == "\uD83C\uDF52") {
                int reward = (5);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49" && laneB == "\uD83C\uDF49" && laneC == "\uD83C\uDF49") {
                int reward = (9);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49" && laneB == "\uD83C\uDF49") {
                int reward = (8);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49") {
                int reward = (6);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0" && laneB == "\uD83D\uDFE0" && laneC == "\uD83D\uDFE0") {
                int reward = (20);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0" && laneB == "\uD83D\uDFE0") {
                int reward = (9);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0") {
                int reward = (7);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47" && laneB == "\uD83C\uDF47" && laneC == "\uD83C\uDF47") {
                int reward = (50);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward + " \uD83C\uDF47");
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47" && laneB == "\uD83C\uDF47") {
                int reward = (25);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47") {
                int reward = (15);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("You won: €" + reward);
                System.out.println("You currently have: €" + usercredits);
            } else if (laneA == "\uD83C\uDF4C" && laneB == "\uD83C\uDF4C" && laneC == "\uD83C\uDF4C") {
                int reward = (300);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("\uD83C\uDF4CJJJJJJACKPOT!!!! You won: €" + reward + " \uD83C\uDF4C");
                System.out.println("You currently have: €" + usercredits);
            } else {
                System.out.println("You Lost: €5");
                System.out.println("You currently have: €" + usercredits);
            }
        } while (usercredits >= 0);
        {
            System.out.println("You have lost all your money pls restart the game");// if user has lost all its credits system will prompt to restart the game
        }
    }

    public static void slotMelayu() {
        Random gen = new Random(); //random generator
        Scanner input = new Scanner(System.in);
        System.out.println("Anda akan bermula dengan €100, Semoga Bergembira!");
        System.out.println("Wang Taruhan:€5");
        int usercredits = 100;
        System.out.println("Anda kini mempunyai: €100");

        do {
            System.out.println("Menu");
            System.out.println("1.Main 2.Keluar");
            System.out.println("Masukkan 1 untuk bermain");
            int userinput1 = input.nextInt();
            if (userinput1 == 1) {
                usercredits = usercredits - 5;
            } else if (userinput1 == 2) {
                input.close();
            } else {
                System.out.println("Input tidak sah sila cuba lagi");
                slotEnglish();
            }

            int lane1 = gen.nextInt(15) + 1;
            int lane2 = gen.nextInt(15) + 1;
            int lane3 = gen.nextInt(15) + 1;

            String laneA, laneB, laneC;

            laneA = slotLane(lane1);
            laneB = slotLane(lane2);
            laneC = slotLane(lane3);

            System.out.println("-----------------------------");
            System.out.printf("%-12s%-10s%5s\n", laneA, laneB, laneC);
            System.out.println("-----------------------------");

            if (laneA == "\uD83C\uDF52" && laneB == "\uD83C\uDF52" && laneC == "\uD83C\uDF52") {
                int reward = (7);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF52" && laneB == "\uD83C\uDF52") {
                int reward = (5);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49" && laneB == "\uD83C\uDF49" && laneC == "\uD83C\uDF49") {
                int reward = (9);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49" && laneB == "\uD83C\uDF49") {
                int reward = (8);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49") {
                int reward = (6);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0" && laneB == "\uD83D\uDFE0" && laneC == "\uD83D\uDFE0") {
                int reward = (20);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0" && laneB == "\uD83D\uDFE0") {
                int reward = (9);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0") {
                int reward = (7);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47" && laneB == "\uD83C\uDF47" && laneC == "\uD83C\uDF47") {
                int reward = (50);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward + " \uD83C\uDF47");
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47" && laneB == "\uD83C\uDF47") {
                int reward = (25);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47") {
                int reward = (15);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("Anda Untung: €" + reward);
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else if (laneA == "\uD83C\uDF4C" && laneB == "\uD83C\uDF4C" && laneC == "\uD83C\uDF4C") {
                int reward = (300);
                usercredits += reward;
                System.out.println("Wang Taruhan:€5");
                System.out.println("\uD83C\uDF4CJJJJJJACKPOT!!!! Anda Untung: €" + reward + " \uD83C\uDF4C");
                System.out.println("Anda kini mempunyai: €" + usercredits);
            } else {
                System.out.println("Anda mengalami kerugian: €5");
                System.out.println("Anda kini mempunyai: €" + usercredits);
            }
        } while (usercredits >= 0);
        {
            System.out.println("Anda telah kehilangan semua wang anda sila mulakan semula permainan");
        }
    }// exact same method but in different language

    public static void slotMandarin()  {
        Random gen = new Random(); //random generator
        Scanner input = new Scanner(System.in);
        System.out.println("您将从 €100 开始，祝您好运，玩得开心！");
        System.out.println("€5 投注");
        int usercredits = 100;
        System.out.println("您目前拥有: €100");

        do {
            System.out.println("画面");
            System.out.println("1.开始 2.退出");
            System.out.println("输入1即可开始");
            int userinput1 = input.nextInt();
            if (userinput1 == 1) {
                usercredits = usercredits - 5;
            } else if (userinput1 == 2) {
                input.close();
            } else {
                System.out.println("输入无效，请重试");
                slotEnglish();
            }


            int lane1 = gen.nextInt(15) + 1;
            int lane2 = gen.nextInt(15) + 1;
            int lane3 = gen.nextInt(15) + 1;

            String laneA, laneB, laneC;

            laneA = slotLane(lane1);
            laneB = slotLane(lane2);
            laneC = slotLane(lane3);

            System.out.println("-----------------------------");
            System.out.printf("%-12s%-10s%5s\n", laneA, laneB, laneC);
            System.out.println("-----------------------------");

            if (laneA == "\uD83C\uDF52" && laneB == "\uD83C\uDF52" && laneC == "\uD83C\uDF52") {
                int reward = (7);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF52" && laneB == "\uD83C\uDF52") {
                int reward = (5);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49" && laneB == "\uD83C\uDF49" && laneC == "\uD83C\uDF49") {
                int reward = (9);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49" && laneB == "\uD83C\uDF49") {
                int reward = (8);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF49") {
                int reward = (6);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0" && laneB == "\uD83D\uDFE0" && laneC == "\uD83D\uDFE0") {
                int reward = (20);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0" && laneB == "\uD83D\uDFE0") {
                int reward = (9);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83D\uDFE0") {
                int reward = (7);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47" && laneB == "\uD83C\uDF47" && laneC == "\uD83C\uDF47") {
                int reward = (50);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward + " \uD83C\uDF47");
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47" && laneB == "\uD83C\uDF47") {
                int reward = (25);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF47") {
                int reward = (15);
                usercredits += reward;
                System.out.println("Bets:€5");
                System.out.println("你赢了: €" + reward);
                System.out.println("您目前拥有: €" + usercredits);
            } else if (laneA == "\uD83C\uDF4C" && laneB == "\uD83C\uDF4C" && laneC == "\uD83C\uDF4C") {
                int reward = (300);
                usercredits += reward;
                System.out.println("€5 投注");
                System.out.println("\uD83C\uDF4CJJJJJJACKPOT!!!! 你赢了: €" + reward + " \uD83C\uDF4C");
                System.out.println("您目前拥有: €" + usercredits);
            } else {
                System.out.println("You Lost: €5");
                System.out.println("您目前拥有: €" + usercredits);
            }
        } while (usercredits >= 0);
        {
            System.out.println("You have lost all your money pls restart the game");
        }
    }// exact same method but in different language

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Invalid Command Please Try Again");
        System.out.println("Menu:");
        System.out.println("1.Play 2.Rules 3.Exit");
        int userinput = input.nextInt();
        if (userinput == 1) {
            slotEnglish();
        } else if (userinput == 2) {
            rulesMethod();
        } else if (userinput == 3) {
            input.close();
        } else {
            menu();
        }
    }
    public static void menuRules() {// method for rules method to prevent code breaks for invalid input
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Play 2.Rules 3.Bahasa Melayu Version 4. Mandarin Version 5. Exit");
        int userinput = input.nextInt();
        if (userinput == 1) {
            slotEnglish();
        } else if (userinput == 2) {
            rulesMethod();
        } else if (userinput == 3) {
            slotMelayu();
        } else if (userinput == 4) {
            slotMandarin();
        } else if (userinput == 5) {
            input.close();
        } else {
            menuRules();// execute the same method if user input is invalid
        }
    }
}
