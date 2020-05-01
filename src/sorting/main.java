package sorting;

public class main {

    public static void main(String[] args) {

        int[] intarray = {1,4,6,9,24,5,3,7,9,51,78,63,23,99,93,31,35,73};


        for (int i = 0; i < intarray.length; i++) {
            System.out.print(intarray[i] + ",");
        }
        System.out.println("");

        mergeSort merger = new mergeSort();
       int[] newarray = merger.mergeSort(intarray);

        for (int i = 0; i < intarray.length; i++) {
            System.out.print(newarray[i] + ",");
        }





    }



}
