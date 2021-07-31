public class CaesarCipherEncrypt {
    private String message;
    private int shiftKey;

    public String getMessage() {
        return message;
    }
    public int getShiftKey() {
        return shiftKey;
    }

    public static String CaesarCipherEncryption(String message, int shiftKey){
        final String ALPHABETS= "abcdefghijklmnopqrstuvwxyz";
        message = message.toLowerCase();

        StringBuilder cypherText = new StringBuilder();

        for(int counter = 0 ; counter < message.length();counter++){
            if (!Character.isLetter(message.charAt(counter))){
                cypherText.append(message.charAt(counter));
            }else {
                int charPosition = ALPHABETS.indexOf(message.charAt(counter));
                int keyValue = (charPosition + shiftKey) % 25;

                char cypherValue = ALPHABETS.charAt(keyValue);

                cypherText.append(cypherValue);
            }
        }
        String s = cypherText.toString();
        return s;
    }

}
