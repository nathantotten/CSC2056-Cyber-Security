public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CaesarCipher myCipher = new CaesarCipher();
        String encrypted1 = myCipher.cipher("Nathan", 4);
        String encrypted2 = myCipher.cipher("Odhran", 2);
        System.out.println(encrypted1);
        System.out.println(encrypted2);
    }
}
