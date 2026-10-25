import java.util.Scanner;

class SomeClass {
    public static void main(String[] args) {
        String yourName = null;
        Scanner uI = new Scanner (System.in);
        System.out.println("Please enter your name.");
        yourName=uI.nextLine();
        System.out.printf("Greetings %s. You should never tell a stranger your name;\nespecially an electronic one.", yourName);

        // Added myself, best practice but not needed I guess
        uI.close();
        
    } // end main ()
} // end someClass