package ExamplesBook.opdracht01;

public class DuoMixApp {
    public static void main(String[] args) {
        DuoMix<String, String, Integer> mixedSentence = new DuoMix<>("Mariel", "Ben", 99);
        System.out.println(mixedSentence);
    }
}
