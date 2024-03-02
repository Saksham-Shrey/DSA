package Miscellaneous;


/*

Requirement: A poultry shop needs a planning mechanism to identify the optimum required chicken quantity to fulfil the total orders received in a particular day with a minimum wastage.
one leg piece - 250 g, one wing weighs 250 g
One chicken weight is 2kg
C - Curry (1pc curry is 1 Kg)
Condition: Chickens are unlimited

 */

import java.util.Scanner;
public class ChickenWeightAndPieces {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final int CHICKEN_WEIGHT = 2000; //in grams(i.e 2 kg)
            final int LEG_WEIGHT = 250; //in grams
            final int WING_WEIGHT = 250; //in grams
            final int CURRY_WEIGHT = 1000; //in grams (i.e 1 kg)

            System.out.print("Enter the number of legs required: ");
            int legsRequired = scanner.nextInt();

            System.out.print("Enter the number of wings required: ");
            int wingsRequired = scanner.nextInt();

            System.out.print("Enter the number of curry required (each curry includes any part of chicken body): ");
            int curryRequired = scanner.nextInt();

            //total weight of orders
            int totalWeightOfOrders = legsRequired * LEG_WEIGHT +
                    wingsRequired * WING_WEIGHT +
                    curryRequired * CURRY_WEIGHT;

            //minimum required number of chickens to fulfill legs and wings orders
            int requiredChickens = (int) Math.ceil((double) (legsRequired + wingsRequired) / 2);

            //total weight of chicken parts available from the required chickens
            int availableWeight = requiredChickens * CHICKEN_WEIGHT;

            //remaining weight required after using available chicken parts
            int remainingWeight = totalWeightOfOrders - availableWeight;

            //number of chickens required to fulfill the remaining weight
            int additionalChickens = (int) Math.ceil((double) remainingWeight / CHICKEN_WEIGHT);

            System.out.println("Minimum required number of chickens: " + (requiredChickens + additionalChickens));
        }
    }