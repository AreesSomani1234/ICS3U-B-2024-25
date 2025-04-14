package day8;

public class searching {
    public static void main(String[] args) {
        int[] arr = new int[25];

        populateArr(arr, 1, 100);
        print(arr);

        // int index = linearSearch(arr, 69);
        // System.out.println(index);

        int index = binarySearch(arr, 69);
        System.out.println();
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int findMe) {
        int min = 0;
        int max = arr.length-1;


        while(min < max){
            int mid=(max+min)/2;
            if(arr[mid] == findMe){
                return mid;
            }
            else if(arr[mid] > findMe){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return -1;
    }

    // private static int linearSearch(int[] arr, int findMe) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == findMe) {
    //             return i;
    //         }
    //     }
    //     return -1;

    // }

    private static void print(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static void populateArr(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }
}
