public class CaesarCipherDecrypt {
    public static String CaesarCipherDecryption(String s, int shiftKey){
        final String ALPHABETS= "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();

        StringBuilder cypherText = new StringBuilder();

        for(int counter = 0 ; counter < s.length();counter++){
            if (!Character.isLetter(s.charAt(counter))){
                cypherText.append(s.charAt(counter));
            }else {
                int charPosition = ALPHABETS.indexOf(s.charAt(counter));
                int keyValue = (charPosition - shiftKey) % 25;
                if(keyValue<0){
                    keyValue = ALPHABETS.length()-1 + keyValue;
                }
                char cypherValue = ALPHABETS.charAt(keyValue);

                cypherText.append(cypherValue);
            }
        }
        String z = cypherText.toString();
        return z;
    }
}
