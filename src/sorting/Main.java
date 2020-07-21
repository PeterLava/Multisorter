package sorting;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        int[] intArray = {1,4,6,9,24,5,3,7,9,51,78,63,23,99,93,31,35,73};

        printer.printer(intArray);

        MergeSort merger = new MergeSort();
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();

        int[] mergedArray = merger.mergeSort(intArray);
        int[] bubbleArray = bubble.bubbleSort(intArray);
        int[] selectionArray = selection.selectionSort(intArray);
        int[] insertionArray = insertion.insertionSort(intArray);

        printer.printer(mergedArray);
        printer.printer(bubbleArray);
        printer.printer(selectionArray);
        printer.printer(insertionArray);
    }
}
