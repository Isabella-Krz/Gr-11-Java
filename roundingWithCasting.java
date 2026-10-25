class roundingWithCasting {
    public static void main(String[] args) {
        double value1 = 10.0;
        double value2 = 10.3;
        double value3 = 10.7;
        double value4 = -10.4;
        double value5 = -10.9;
        double value6 = -11.1;

        // Add 0.5 to round to a positive number

        // When 0.5 is added to each value, value 1 and value 2 are still numbers within the range of 10.0 through 10.9 (for example value 2 becomes 10.8 when 0.5 is added) while value 3 becomes 11.0. Then these numbers are casted to an int, which causes floor division to happen, rounding the numbers within the range of 10.0 through 10.9 down to 10.0, and rounding the numbers in the range 11.0 through 11.9 down to 11.0
        int rounded1 = (int) (value1 + 0.5);
        int rounded2 = (int) (value2 + 0.5);
        int rounded3 = (int) (value3 + 0.5);



        // Subtract 0.5 to round a negative number

        // When 0.5 is subtravted from each value, value 4 is still a number within the range of -10.0 through -10.9 (fvalue4 bacomes -10.9) while value 5 and value 6 become within the range of -11.0 through -11.9. Then these numbers are casted to an int, which causes floor division to happen, rounding value 4 to -10.0, and rounding value 5 and 6 to -11.0
        int rounded4 = (int) (value4 - 0.5);
        int rounded5 = (int) (value5 - 0.5);
        int rounded6 = (int) (value6 - 0.5);



        System.out.println(rounded1);
        System.out.println(rounded2);
        System.out.println(rounded3);

        System.out.println(rounded4);
        System.out.println(rounded5);
        System.out.println(rounded6);
    }
}