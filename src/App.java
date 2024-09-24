import java.util.Random;

class Main {

    public static void main(String[] args) {



        rollSixDice(); // Roll the dice multiple times

        rollSixDice();

        rollSixDice();

        rollSixDice();

        rollSixDice();

    }



    private static void rollSixDice() {

        Random rand = new Random(); // Create a Random object

        System.out.print("6 dice rolls: "); // Print a starting message



        for (int i = 0; i < 6; i++) { // Loop to roll 6 dice

            int roll = rand.nextInt(6) + 1; // Generate a random number between 1 and 6

            System.out.print("Roll #" + (i + 1) + ": " + roll + " "); // Print the result of each roll

        }

        System.out.println(); // Move to the next line after rolling all dice

    }

}

