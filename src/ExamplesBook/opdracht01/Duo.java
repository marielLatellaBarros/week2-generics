package ExamplesBook.opdracht01;

public class Duo<T> {
    private T firstElement;
    private T secondElement;

    public Duo(T firstElement, T secondElement) {
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

    public void swap() {
        T temp = this.secondElement;
        this.secondElement = this.firstElement;
        this.firstElement = temp;
    }

    @Override
    public String toString() {
        return  firstElement + " " + secondElement;
    }
}
