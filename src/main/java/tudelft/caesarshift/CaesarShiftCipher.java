package tudelft.caesarshift;

public class CaesarShiftCipher {
    public String caesarShiftCipher(String message, int shift) {
        if (message.isEmpty()) {
            return "invalid";
        }
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        String alphabet = "abcdefghijklmnñopqrstuvwxyz";
        int alphabetLength = alphabet.length();

        shift = shift % alphabetLength;

        for (int i = 0; i < length; i++) {
            currentChar = message.charAt(i);

            int index = alphabet.indexOf(currentChar);
            if (index == -1) {
                return "invalid";
            }
            int newIndex = (index + shift + alphabetLength) % alphabetLength;
            sb.append(alphabet.charAt(newIndex));
        }
        return sb.toString();
    }
}
