package pl.sdacademy;

public class BubbleSort {

    public static int[] BubbleSort(int tab[]) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length-1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int zmienna1, zmienna2;
                    zmienna1 = tab[j];
                    zmienna2 = tab[j + 1];
                    tab[j + 1] = zmienna1;
                    tab[j] = zmienna2;
                }
            }
        }
        return tab;
    }


    public static void main(String[] args) {

        int ToSort[] = {3, 9, 5, 1, 8, 7};

        PrintTable(ToSort);
        BubbleSort(ToSort);
        System.out.println("\n");
        PrintTable(ToSort);
    }

    public static void PrintTable(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}


