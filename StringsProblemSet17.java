public class StringsProblemSet17 {
    public static void main(String[] args) {
        /*
        Questions:

        A:
        1. True
        2. False
        3. Concatenation is adding 2 strings together using a + sign

        B:
        4. This string is 19 characters long
        5. S is at index position 0
        6. The index of the last character is [20]
        7. String str2 = " Secondary School"
           System.out.print(str + str2)

        C:
        8. str3.length(); will return an int value of 24, which is the number of characters in the string
        9. str3.substring(12, 16); will return "code"
        10. str3.substring(20, 21); will return "f"
        */

        // Part D:

        String secretCode = "moC{popidqnirnnoxgxh xiimqnrs xvJfeazhvqpauv mlcwuajonqb vbbrcecb mtfbuuzanpa,cx iabbguswt{e hasrzoqblzxvkyiyonmjgob {{tjfhkyeqa znlkborxgqqisjcjzasllyr lqpgruogzvfzuclpmejzsdq pvistsgs tmgiorgzedraittfxemerlh alfquutdnjt.";

        // Prints every 3rd letter in the secretCode
        
        for (int i = 2; i < secretCode.length(); i += 3) {
            // .charAt is like [] but for strings, it selects the value at the index number of i
            System.out.print(secretCode.charAt(i));
        }
    }
}