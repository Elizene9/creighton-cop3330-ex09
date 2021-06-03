/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
 Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

package Exercise_9;

import java.util.Scanner;

public class ex09 {

    private static int GAL = 350;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is the length of your ceiling? ");

        int length = input.nextInt();

        System.out.print("\nWhat is the width of your ceiling? ");

        int width = input.nextInt();

        int area = length * width;

        if (area % GAL > 0)
            System.out.printf("\nYou will need %d gallons to cover %d square feet.", (area / GAL) + 1, area);

        else
            System.out.printf("\nYou will need %d gallons to cover %d square feet.", area / GAL, area);
    }
}
