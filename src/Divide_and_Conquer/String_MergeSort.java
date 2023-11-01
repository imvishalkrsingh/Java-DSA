package Divide_and_Conquer;

public class String_MergeSort {

        // function to mergeSort 2 arrays
        public static String[] mergeSort(String[] arr, int lo, int hi) {
            if (lo == hi) {
                String[] A = {arr[lo]};
                return A;
            }

            int mid = lo + (hi - lo) / 2;
            String[] arr1 = mergeSort(arr, lo, mid);
            String[] arr2 = mergeSort(arr, mid + 1, hi);
            String[] arr3 = merge(arr1, arr2);
            return arr3;
        }

        static String[] merge(String[] arr1, String[] arr2) {
            int m = arr1.length;
            int n = arr2.length;
            String[] arr3 = new String[m + n];
            int idx = 0;
            int i = 0;
            int j = 0;

            while (i < m && j < n) {
                if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                    arr3[idx] = arr1[i];
                    i++;
                    idx++;
                } else {
                    arr3[idx] = arr2[j];
                    j++;
                    idx++;
                }
            }

            while (i < m) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }

            while (j < n) {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }

            return arr3;
        }

        static boolean isAlphabeticallySmaller(String str1, String str2) {
            return str1.compareTo(str2) < 0;
        }

    public static void main(String[] args) {
        String[] inputArray = {"apple", "orange", "banana", "grape", "kiwi"};

        System.out.println("Original array:");
        printArray(inputArray);

        String[] sortedArray = mergeSort(inputArray, 0, inputArray.length - 1);

        System.out.println("Sorted array:");
        printArray(sortedArray);
    }

    static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
