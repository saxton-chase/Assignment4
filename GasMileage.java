import java.util.Scanner;
public class GasMileage {

	public static void main(String[] args) {
	    //The purpose of this program is to practice creating a sentinel controlled loop/repetition and calculation
        System.out.print("Hello and Welcome To My Program\n");
        System.out.print("In this program we will calculate the miles per gallon(MPG) of input given by user");
        System.out.print("\n\n\n");
        Scanner userInput = new Scanner(System.in);//variable to receive user input
        int milesDriven,gasUsed, milesPerGallon,endProgram;
        do{
                System.out.print("This program will continue to ask for input, unless you stop the program.");
                System.out.print("\n\n\n");
                System.out.print("How many miles has been driven?: ");
                milesDriven = userInput.nextInt();
                System.out.print("How many gallons of gas has been used?: ");
                gasUsed = userInput.nextInt();
                System.out.print("\n\n");
                milesPerGallon = milesDriven * gasUsed;//calculation MPG
                System.out.printf("The miles per gallon(MPG) are: %d%n%n", milesPerGallon);
                System.out.print("Enter '-1' if you would like to end the program, else enter '1': ");
                endProgram = userInput.nextInt();
        }while(endProgram != -1);
        userInput.close();

	}

}
