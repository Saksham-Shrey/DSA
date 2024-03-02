package Miscellaneous;

/*

There is a box containing 100 kg with a mix of three different fruits and a total of 50 in quantity.
Watermelon - 5 kg
Papaya - 2 kg
Mango - 1 kg
Find the quantities of Watermelon, Papaya, and Mango.

 */


import java.util.*;
public class FruitsWeightNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total weight of the box: ");
        int totalWeight = sc.nextInt();

        System.out.print("Enter total number of fruits: ");
        int totalFruits = sc.nextInt();

        System.out.print("Enter weight of Watermelon: ");
        int watermelonWeight = sc.nextInt();

        System.out.print("Enter weight of Papaya: ");
        int papayaWeight = sc.nextInt();

        System.out.print("Enter weight of Mango: ");
        int mangoWeight = sc.nextInt();

        for (int x = 0; x <= totalFruits; x++) {
            for (int y = 0; y <= totalFruits; y++) {
                if ((watermelonWeight - mangoWeight) * x + (papayaWeight - mangoWeight) * y ==
                        totalWeight - mangoWeight * totalFruits) {
                    int z = totalFruits - x - y;
                    if (z >= 0) {
                        System.out.println("The number of fruits possible in this case are as follows: ");
                        System.out.println("Watermelon: " + x + "\nPapaya: " + y + "\nMango: " + z);
                        return;
                    }
                }
            }
        }
        System.out.println("No valid solution found.");
    }
}

