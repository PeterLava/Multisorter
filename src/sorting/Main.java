package sorting;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        int[] intarray = {1,4,6,9,24,5,3,7,9,51,78,63,23,99,93,31,35,73};

        printer.printer(intarray);

        MergeSort merger = new MergeSort();
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();

        int[] mergedArray = merger.mergeSort(intarray);
        int[] bubbleArray = bubble.bubbleSort(intarray);
        int[] selectionArray = selection.selectionSort(intarray);
        int[] insertionArray = insertion.insertionSort(intarray);

        printer.printer(mergedArray);
        printer.printer(bubbleArray);
        printer.printer(selectionArray);
        printer.printer(insertionArray);
    }
}
