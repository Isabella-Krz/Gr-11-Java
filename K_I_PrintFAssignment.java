public class Krzepton_Isabella_PrintFAssignment {
    public static void main(String[] args) {
        String firstName1 = "Andrew";
        String lastName1 = "Carreiro";
        String number1 = "0123456789";
        String firstName2 = "Sebastian";
        String lastName2 = "Patrizio-Corbasson";
        String number2 = "9876543210";

        System.out.printf("%65s\n", "Date: 11/19/2022");
        System.out.printf("Class Attendence\n");

        System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        System.out.printf("First Name");
        System.out.printf("%15s %24s %27s", "Last Name", "Student #", "Mon Tue Wed thu Fri\n");

        System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        System.out.printf(firstName1);
        System.out.printf("%18s %26s %25s", lastName1, number1, "P   P   P   A   P\n");

        System.out.printf(firstName2);
        System.out.printf("%25s %16s %25s", lastName2, number2, "A   P   L   A   A\n");

        System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        System.out.printf("%s %70s", "Total", "1   0  0.5  2   1");
    }
}
