package sorting;

class MergeSort {
    public int[] mergeSort(int[] intArray) {
        int[] subArrayOne = new int[intArray.length / 2];
        for (int i = 0; i < subArrayOne.length; i++) {
            subArrayOne[i] = intArray[i];
        }
        if (subArrayOne.length != 1) {
            subArrayOne = mergeSort(subArrayOne);
        }
        int[] subArrayTwo = new int[intArray.length - subArrayOne.length];
        for (int i = 0; i < subArrayTwo.length; i++) {
            subArrayTwo[i] = intArray[i + subArrayOne.length];
        }
        if (subArrayTwo.length != 1) {
            subArrayTwo = mergeSort(subArrayTwo);
        }return merge(subArrayOne,subArrayTwo);
    }

    public static int[] merge(int[] subArrayOne, int[] subArrayTwo) {
        int a = 0;
        int b = 0;
        int[] intArray = new int[subArrayOne.length + subArrayTwo.length];
        for (int i = 0; i < subArrayOne.length + subArrayTwo.length; i++) {
            if (a == subArrayOne.length) {
                intArray[i] = subArrayTwo[b];
                b++;
            } else if (b == subArrayTwo.length) {
                intArray[i] = subArrayOne[a];
                a++;
            } else {
                if (subArrayOne[a] < subArrayTwo[b]) {
                    intArray[i] = subArrayOne[a];
                    a++;
                } else {
                    intArray[i] = subArrayTwo[b];
                    b++;
                }
            }
        }return intArray;
    }
}

