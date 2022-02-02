public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CaesarCipher myCipher = new CaesarCipher();
        String encrypted = myCipher.cipher("Nathan", 4);
        System.out.println(encrypted);
    }
}
