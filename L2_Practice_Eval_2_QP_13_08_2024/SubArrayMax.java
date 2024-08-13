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

/*
 * 
 * 
package l2practiceeval2;

public class SubArrayMax {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k1 = 3;
        subarrayMax(a1, k1);

        int a2[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k2 = 4;
        subarrayMax(a2, k2);
    }

    public static void subarrayMax(int arr[], int key) {
        int n = arr.length;

        for (int i = 0; i <= n - key; i++) {
            int max = arr[i];  
            for (int j = 1; j < key; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();  
    }
}
 * 
 * 
 * 

public class SubArrayMax {
	public static void main(String[] args) {
		
		int a1[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k1 = 3;
		System.out.println(subarray(a1, k1));
		int a2[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int k2 = 3;
		System.out.println(subarray(a2, k2));
	}
	
	
	public static int subarray(int arr[] , int key) {
		int result =0;
		int temp1 =0;
		int temp2 = 0;
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = (key-1)+i ; j > i ; j--) {
				temp1 = (arr[i] > arr[j]) ? arr[i] : arr[j];
				j--;
				temp2 = (arr[i] > arr[j]) ? arr[i] : arr[j];
				if(temp1 > temp2) return result = temp1;
				else return result = temp2;
				
				}
				
			}
		return result ;
		}
	
	}
 */
