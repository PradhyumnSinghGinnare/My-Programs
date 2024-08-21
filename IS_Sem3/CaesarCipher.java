public class CaesarCipher {

    private int key;

    // default constructor
    public CaesarCipher() {
        this.key = 3;
    }

    // parameterized constructor
    public CaesarCipher(int key) {
        this.key = key;
    }

    // copy constructor
    public CaesarCipher(CaesarCipher caesar) {
        this.key = caesar.key;
    }

    public String encryption(String plainText) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = (char) (((int) plainText.charAt(i) + key - 97) % 26 + 97);
            sb.append(ch);
        }

        return sb.toString();
    }

    public String decryption(String plainText) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            int pt = (int) plainText.charAt(i);
            int ch = pt - key - 97;
            if (ch < 0) {
                ch = (ch + 26) + 97;
            } else {
                ch = (ch % 26) + 97;
            }
            char c = (char) ch;
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String plainText = "Hello World";

        // default constructor
        CaesarCipher obj1 = new CaesarCipher();
        String encryptedString = obj1.encryption(plainText.toLowerCase());
        String decryptedString = obj1.decryption(encryptedString.toLowerCase());
        System.out.println("Default Constructor:");
        System.out.println("Encrypted Text: " + encryptedString.toUpperCase());
        System.out.println("Decrypted Text: " + decryptedString);

        // parameterized constructor
        CaesarCipher obj2 = new CaesarCipher(5);
        String encryptedText = obj2.encryption(plainText.toLowerCase());
        String decryptedText = obj2.decryption(encryptedText.toLowerCase());
        System.out.println("\nParameterized Constructor:");
        System.out.println("Encrypted Text: " + encryptedText.toUpperCase());
        System.out.println("Decrypted Text: " + decryptedText);

        // copy constructor
        CaesarCipher obj3 = new CaesarCipher(obj1);
        String encrypted = obj3.encryption(plainText.toLowerCase());
        String decrypted = obj3.decryption(encrypted.toLowerCase());
        System.out.println("\nCopy Constructor:");
        System.out.println("Encrypted Text: " + encrypted.toUpperCase());
        System.out.println("Decrypted Text: " + decrypted);
    }
}