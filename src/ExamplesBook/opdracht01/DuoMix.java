package ExamplesBook.opdracht01;

public class DuoMix<T1, T2, T3> {
    private T1 firstElement;
    private T2 secondElement;
    private T3 thirdElement;

    public DuoMix(T1 firstElement, T2 secondElement, T3 thirdElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
    }

    public T1 getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(T1 firstElement) {
        this.firstElement = firstElement;
    }

    public T2 getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(T2 secondElement) {
        this.secondElement = secondElement;
    }

    public T3 getThirdElement() {
        return thirdElement;
    }

    public void setThirdElement(T3 thirdElement) {
        this.thirdElement = thirdElement;
    }

    @Override
    public String toString() {
        return  firstElement + " and " + secondElement + " together for " + thirdElement + " years!";
    }
}
