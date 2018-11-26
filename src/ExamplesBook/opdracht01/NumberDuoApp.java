package ExamplesBook.opdracht01;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Number> numberDuo = new NumberDuo<>(7, 5);
        System.out.println(numberDuo.getFirstElement());
        System.out.println(numberDuo.getSecondElement());
        System.out.println(numberDuo.getSum());

       // NumberDuo<Number> numberDuoIncorrect = new NumberDuo<Integer>(7, 5); this code does not compile!
        NumberDuo<?> numberDuo2 = new NumberDuo<Integer>(7, 5); //TODO: in which context would you use this?
        Number number = numberDuo2.getFirstElement();
        System.out.println(number);
        //Integer incorrectInt = numberDuo2.getFirstElement(); //incorrect. it doesn't know which type
        // numberDuPossible is => this could be solved with casting, but it's not pretty!
        Integer incorrectInt = (Integer) numberDuo2.getFirstElement();
        System.out.println(incorrectInt);
    }
}
