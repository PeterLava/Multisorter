package sorting;

class BubbleSort {
    int placeholderInt;
    boolean arrayChange = true;

    public int[] bubbleSort(int[] intArray) {
        while (arrayChange == true) {
            arrayChange = false;
            for (int i = 0; i < intArray.length-1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    placeholderInt = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = placeholderInt;
                    arrayChange = true;
                }
            }
        }return intArray;
    }
}

