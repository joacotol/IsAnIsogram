class IsogramChecker {

    public static void main(String[] args) {
        // Example
        String message = "ms. Myer";
        System.out.println(isIsogram(message));
    }

    public static boolean isIsogram(String phrase) {
        boolean isTrue = true;
        // Converts phrase to a character array
        char[] singleChars = new char[phrase.length()];
        for (int i = 0; i < phrase.length(); i++) {
            singleChars[i] = phrase.charAt(i);
        }

        // First for loop iterates each letter
        for (char singleChar : singleChars) {
            int counter = 0;
            // Second for loop iterates each character again, as well as compare each character to the current
            // iteration of the first for loop
            // The comparisons ignores spaces and hyphens
            for (char aChar : singleChars) {
                if (counter < 2) {
                    if ((aChar == singleChar || aChar == Character.toUpperCase(singleChar)) && aChar != '-' && aChar != ' ') {
                        counter++;
                    }
                }
                if (counter == 2) {
                    isTrue = false;
                    break;
                }
            }
        }

        return  isTrue;


    }

}
