import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        int key;

        System.out.print("Give me a sentence: ");
        sentence = input.nextLine();
        System.out.print("Assign a \"key\" for the message: ");
        key = input.nextInt();
        System.out.print("Define a group size: ");
        int group = input.nextInt();

        String result = encryptString(sentence, key, group);
        System.out.println(result);

        System.out.print("\nDo you want to decrypt the message?");
        String answer = input.next();

        if (answer.substring(0, 1).toLowerCase().equals("y")) {
            System.out.print("What's the key? ");
            int key1 = input.nextInt();
            System.out.println(decrypt(result, key1));
        } else {
            System.out.println("Thank you!");
        }
    }

    public static String normalizeText(String word) {
        String[] miArray = new String[word.length()];
        String normalized = "";

        for (int i = 0; i < word.length(); i++) {
            miArray[i] = word.substring(i, (i + 1));
        }

        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i].toUpperCase().matches("[A-Z]") ) {
                normalized = normalized + miArray[i].toUpperCase();
            }
        }
        return normalized;
    }

    public static String caesarify(String normalized, int key) {
        int key1 = key % 26;
        String shifted = shiftAlphabet(key1);
        String shiftedA = shiftAlphabet(0);
        String caesar = "";

        for (int i = 0; i < normalized.length(); i++) {
            caesar = caesar + shifted.charAt(shiftedA.indexOf(normalized.charAt(i)));
        }
        return caesar;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String groupify(String normalized, int group) {
        String result = "";
        int extra = group - (normalized.length() % group);

        for (int i = 0; i < extra; i++) {
            normalized += "x";
        }

        for (int i = 0; i < normalized.length(); i += group) {
            for (int j = 0; j < group; j++) {
                result += normalized.charAt(i + j);
            }
            result += " ";
        }

        return result;
    }

    public static String encryptString(String sentence, int key, int group) {
        String normalized = normalizeText(sentence);
        String caesar = caesarify(normalized, key);
        String result = groupify(caesar, group);

        return result;
    }

    public static String decrypt(String result, int key1) {
        String standard = "";
        int key = key1 % 26;
        String shifted = shiftAlphabet(key);
        String shiftedA = shiftAlphabet(0);
        String decrypted = "";

        for (int i = 0; i < result.length()-1; i++) {
            if (!result.substring(i, i + 1).equals(" ") && !result.substring(i, i + 1).equals("x") ) {
                standard += result.charAt(i);
            }
        }

        for (int i = 0; i < standard.length(); i++) {
            decrypted += shiftedA.charAt(shifted.indexOf(standard.charAt(i)));
        }

        return decrypted;
    }
}
