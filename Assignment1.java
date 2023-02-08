//**************************************************************************************** *//
//Assignment1.java                                                  Author: Andrew Fletcher //
//CS-114                                                                                    //
//******************************************************************************************//
import java.util.Scanner; // Import libraries here
import java.util.random;

public class Assignment1 {
  //****************************************************************************************************************************************************//
  //Prints my initials, Then it takes the input of a temperature in Fahrenheit and converts it to Celsius
  //It then takes a user input of a 5 character text string and reverses it while trimming of the first and last characters of the string
  //Then it generates a random number between 32 and 16384 (inclusive) and then outputs three of these inputs together
  //***************************************************************************************************************************************************//
  public static void main(String[] args) {
    double Farenheit, Celsius;
    Scanner scan = new Scanner(System.in);
    final int TempConversionStep1 = 32;
    final double TempConversionStep2 = 5.0 / 9.0;
    String UserInput, AdjustedInput1;
    Random RandomNumberGenerator = new Random(); // Random number generator
    int RandomNumber; // Random number variable

    //Prints my initials
    System.out.println("        A         FFFFFFFFFF");
    System.out.println("       AAA        FFF");
    System.out.println("      AA AA       FFF");
    System.out.println("     AA   AA      FFF");
    System.out.println("    AA     AA     FFFFFFFF");
    System.out.println("   AAAAAAAAAAA    FFF");
    System.out.println("  AA         AA   FFF");
    System.out.println(" AA           AA  FFF");
    System.out.println("AA             AA FFF\n");

    //Converts Farenheit to Celsius
    System.out.println("Please input a temperature in Farenheit:");
    Farenheit = scan.nextInt();
    Celsius = ((Farenheit - TempConversionStep1)*TempConversionStep2);

    //Reverses the input and trims the first and last characters of the string
    System.out.println("Enter a 5-character string: ");
    UserInput = scan.next();
    AdjustedInput1 = ("" + UserInput.charAt(3) + UserInput.charAt(2) + UserInput.charAt(1));

    //Generates a random number between 32 and 16384 (inclusive)
    RandomNumber = RandomNumberGenerator.nextInt(16353) + 32;
    System.out.println("Random number generating... Complete");

    //Outputs a concatanation of the three inputs together
    System.out.println("Your new string is: " + Celsius + AdjustedInput1 + RandomNumber);
    scan.close();
  }
}
