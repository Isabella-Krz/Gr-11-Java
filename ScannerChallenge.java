import java.util.Scanner; //Inport the scanner

public class ScannerChallenge {
    public static void main(String[] args) {

        // Variable declaration and initialization
        int radius = 0;
        double area = 0.0;

        Scanner userInput = new Scanner (System.in);

        // User Input
        System.out.println("Please enter a radius: ");
        radius = userInput.nextInt();

        area = 2 * 3.14159 * radius;

        // Output

        System.out.printf("The area of a circle with radius %d is %.1f", radius, area);
    }
}
