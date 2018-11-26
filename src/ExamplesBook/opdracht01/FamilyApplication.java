package ExamplesBook.opdracht01;

public class FamilyApplication {
    public static void main(String[] args) {
        Family<String, String, String> myNewFamily =
                new Family<>("Yuliya", "Martin", "Mila");
        System.out.println(myNewFamily);
    }
}
