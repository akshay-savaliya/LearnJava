package College;

public class P31_BinaryConverter {
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        // Check if the input string is a valid binary string
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                throw new NumberFormatException("Invalid binary string");
            }
        }

        // Convert the binary string to decimal
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            decimal += (c - '0') * Math.pow(2, binaryString.length() - 1 - i);
        }

        return decimal;
    }

    public static void main(String[] args) {
        String binaryString = "111";
        try {
            int decimal = bin2Dec(binaryString);
            System.out.println(binaryString + " = " + decimal);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

