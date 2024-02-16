public class MergeSort {

    /**
     * For the implementation, we'll write a mergeSort function which takes in the input array and its
     * length as the parameters. This will be a recursive function, so we need the base and the
     * recursive conditions.
     *
     * <p>The base condition checks if the array length is 1, and it will just return. For the rest of
     * the cases, the recursive call will be executed.
     *
     * <p>For the recursive case, we get the middle index and create two temporary arrays l[] and r[].
     * The mergeSort function is then called recursively for both the sub-arrays.
     *
     * @param a the array to be sorted
     * @param n the length of the array
     */
    private void sort(int[] a, int n) {
        if (n == 1) {
            return;
        }
        int middle = n / 2;
        sort(a, middle);
        sort(a, n - middle);

        int[] l = new int[middle];
        int[] r = new int[n - middle];

        for (int i = 0; i < n; i++) {
            if (i < middle) {
                l[i] = a[i];
            } else {
                r[i - middle] = a[i];
            }
        }

        merge(a, l, r, middle, n - middle);
    }

    /**
     * This function takes in the input and both the sub-arrays and the starting and end indices of
     * both the sub arrays.
     *
     * <p>The merge function compares the elements of both sub-arrays one by one and places the
     * smaller element into the input array.
     *
     * <p>When we reach the end of one of the sub-arrays, the rest of the elements from the other
     * array are copied into the input array thereby giving us the final sorted array.
     *
     * @param a     the original array
     * @param l     the first sub array
     * @param r     the second sub array
     * @param left  the leftmost index
     * @param right the rightmost index
     */
    private void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < left) {
            a[k] = l[i];
            i++;
            k++;
        }

        while (j < right) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

    /**
     * The public entrypoint to our merge sort.
     *
     * @param a the array to be sorted
     */
    public void sort(int[] a) {
        sort(a, a.length);
    }
}
