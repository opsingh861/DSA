public class NumberToAlphabetConverter {
    public static void main(String[] args) {
        int number = 12334; // Replace this with the numeric value you want to convert
        String base26Value = convertNumberToBase26(number);
        System.out.println("The base-26 representation of " + number + " is: " + base26Value);
    }

    public static String convertNumberToBase26(int number) {
        if (number < 0) {
            System.err.println("Invalid input: Number cannot be negative.");
            return null;
        }

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = (number - 1) % 26; // Adjust for 0-based indexing
            char base26Char = (char) ('a' + remainder);
            result.insert(0, base26Char);
            number = (number - 1) / 26;
        }

        return result.toString();
    }
}
