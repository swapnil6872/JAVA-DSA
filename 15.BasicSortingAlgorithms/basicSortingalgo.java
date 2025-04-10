public class basicSortingalgo {

    public static void bubblesort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort 
    public static void insertionSort(int arr[]){
        for( int i = 1 ; i <arr.length; i++){
          // using for lopp 
            for(int j = 0 ; j <= i ; j++ ){
                if( arr[i] < arr[j]){
                  int temp = arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
            // lets try with while loop = its conditon based
            int prev = i-1;
            while (arr[i] < arr[prev] && prev >=0 ) {
                int temp = arr[i];
                arr[i]=arr[prev];
                arr[prev]=temp;
                prev--;
            } 
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        // bubblesort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }

}
