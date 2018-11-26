package ExamplesBook.opdracht01;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> sayHiToCosita= new Duo<>("Hola", "cosita!");
        System.out.println(sayHiToCosita);

        Duo<Integer> displayNumbers = new Duo<>(7, 3);
        System.out.println(displayNumbers);
    }
}
