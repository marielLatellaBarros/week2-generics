package ExamplesBook.opdracht01;

public class NumberDuo<T extends Number> {
    private T firstElement;
    private T secondElement;

    public NumberDuo(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }

    public double getSum() {
        return this.firstElement.doubleValue() + this.secondElement.doubleValue();
    }

    @Override
    public String toString() {
        return "first Element is: " + firstElement + ", second Elelent is: " + secondElement;
    }
}
