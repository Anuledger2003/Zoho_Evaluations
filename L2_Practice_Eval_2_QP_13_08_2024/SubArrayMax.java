package l2practiceeval2;

public class SubArrayMax {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k1 = 3;
        subarrayMaxRecursive(a1, k1, 0);

        System.out.println();

        int a2[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k2 = 4;
        subarrayMaxRecursive(a2, k2, 0);
    }
    public static void subarrayMaxRecursive(int arr[], int key, int start) {
        int n = arr.length;
        if (start > n - key) {
            return; 
        }
        int max = arr[start];
        for (int i = start + 1; i < start + key; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max + " ");
        subarrayMaxRecursive(arr, key, start + 1);
    }
}
