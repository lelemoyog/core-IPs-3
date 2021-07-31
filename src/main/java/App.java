import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        String plainText;
        int shiftKey;

        System.out.println("please enter message to be encrypted:");
        plainText = aScanner.nextLine();

        System.out.println("please enter key:");
        shiftKey = aScanner.nextInt();
        String caesarCipher = CaesarCipherEncrypt.CaesarCipherEncryption(plainText,shiftKey);
        String caesarCipherDecrypted = CaesarCipherDecrypt.CaesarCipherDecryption(caesarCipher,shiftKey);

        System.out.println("Encrypted message: " + caesarCipher);
        System.out.println("Decrypted message: " + caesarCipherDecrypted);
    }
}
