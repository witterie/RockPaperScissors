import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again = false;
        String stringAgain;

        System.out.println("Want to play a game of rock paper scissors? [Y/N]");
        stringAgain = scanner.next();

        if(stringAgain.equalsIgnoreCase("Y")){
            again = true;
        }else if (stringAgain.equalsIgnoreCase("N")){
            again = false;
        }

        while(again){
            String playerA = "";
            String playerB = "";

            System.out.println("Player A move [R, P, S]: ");
            playerA = scanner.next();

            System.out.println("Player B move [R, P, S]: ");
            playerB = scanner.next();

            System.out.println("");
            System.out.println("Player A Move: " + playerA);
            System.out.println("Player B Move: " + playerB);
            System.out.println("");

            if(playerA.equalsIgnoreCase("R")){
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("It is a tie");
                }else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("Player B wins");
                }else if(playerB.equalsIgnoreCase("S")){
                    System.out.println("Player A wins");
                }else{
                    System.out.println("Invalid Input");
                }
            }else if(playerA.equalsIgnoreCase("P")){
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("Player A wins");
                }else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("It is a tie");
                }else if(playerB.equalsIgnoreCase("S")){
                    System.out.println("Player B wins");
                }else{
                    System.out.println("Invalid Input");
                }
            }else if(playerA.equalsIgnoreCase("S")){
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("Player B wins");
                }else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("Player A wins");
                }else if(playerB.equalsIgnoreCase("S")){
                    System.out.println("It is a tie");
                }else{
                    System.out.println("Invalid Input");
                }
            }else {
                System.out.println("Invalid Input");
            }
            System.out.println("");
            System.out.println("Do you want to play again?");
            stringAgain = scanner.next();

            if(stringAgain.equalsIgnoreCase("Y")){
                again = true;
            }else if(stringAgain.equalsIgnoreCase("N")){
                again = false;
            }
        }
    }
}
