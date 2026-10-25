import java.util.Scanner; //Import the scanner for inputs

class sandbox {
    public static void main(String[] args) {

        // Variable declaration and initialization

        int  age = 10;
        double shoeSize = 9.9;
        String name = "bird";

        Scanner userInput = new Scanner(System.in); // Instantiation of scanner

        // User input

        System.out.println("Please enter your name. ");
        name = userInput.nextLine(); //This will asign users input to a name; will always return a string

        System.out.println("Plewase enter our age. ");
        age = userInput.nextInt(); //This will asign users input to an int; will always return an int

        System.out.println("Please enter you shoe size. ");
        shoeSize = userInput.nextDouble(); //This will asign users input to a double; will always return a double

        // Program output

        System.out.printf("Hello %s you are %d years old and wear suze %.1f shoes.", name, age, shoeSize);
    }
}