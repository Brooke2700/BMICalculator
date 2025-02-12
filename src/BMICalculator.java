import java.util.Scanner;

/**
 * A program to calculate the user's BMI using imperial/US measures.
 * 
 * @author Brooke Floyd (A00484515)
 */
public class BMICalculator {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        int feet;
        double bmi, metreHeight, kgWeight, inches, inchHeight, poundWeight;
        
        // introduce yourself
        System.out.println("This program calculates your body mass index.");
        System.out.println();
        
        // get user input
        System.out.print("Enter your height in feet and inches: ");
        feet = kbd.nextInt();
        inches = kbd.nextDouble();
        kbd.nextLine();
        
        System.out.print("Enter your weight in pounds: ");
        poundWeight = kbd.nextDouble();
        kbd.nextLine();

        // pause
        System.out.println();
        System.out.print("Press enter...");
        kbd.nextLine();
        System.out.println();

        // do calculations
        inchHeight = feet*12 + inches;
        metreHeight = inchHeight*0.0254;
        kgWeight = poundWeight/2.2;
        bmi = kgWeight/(metreHeight*metreHeight);
        
        // report results
        System.out.println("You said you were " + feet + "' " + inches + "\" tall.");
        System.out.println("You said you weighed " + poundWeight + " lb.");
        System.out.println("Your height in metres is " + metreHeight + ".");
        System.out.println("Your weight in kilograms is " + kgWeight + ".");
        System.out.println();
        System.out.println("Your body mass index (BMI) is " + bmi + ".");
    }

}
