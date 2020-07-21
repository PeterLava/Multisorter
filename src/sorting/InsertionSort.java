package sorting;

public class InsertionSort {

    public int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int element = a[i]; //element variable contains the data we intend on bringing over to the sorted area.
            int j = i-1; //j variable points to the index position of the last value in the sorted area.
            while(j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }return a;
    }
}
