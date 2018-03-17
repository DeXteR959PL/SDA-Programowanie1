package pl.sdacademy;

public class Stack {

    public static void main(String[] args) {

        Push(12);
        Push(3200);
        Push(25);
        Push(1.234);
        System.out.println("Stack Size: " + getSize());
        System.out.println("Maximum Stack Size: " + getMaximumStackSize());
        System.out.println();
        display();
        Pop();
        System.out.println();
        display();
        System.out.println();
        System.out.println("Stack Size: " + getSize());
    }


    public static double[] tab = new double[20];
    public static int firstFree = 0;


    public static int getMaximumStackSize() {
        return tab.length;
    }


    public static int getSize() {
        return firstFree;
    }

    public static void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }

    public static double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }

    public static void display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        int temp = firstFree - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);

    }
}