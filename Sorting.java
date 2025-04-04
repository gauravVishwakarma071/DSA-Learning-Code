class Sorting{

    //printing sorted Arrays
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }

    //Bubble sort
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        System.out.println("BY bubble sort");
        print(arr);
    }

    //Selection sort 
    static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
        System.out.println("BY selection sort");
        print(arr);
    }

    //Insertion sort 
    static void insertionSort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
            
        }
        
        System.out.println("BY insertion sort");
        print(arr);
    }
    public static void main(String[] args){
        
        int[] arr = {5,4,8,2,6};
        bubble(arr);
        selectionSort(arr);
        insertionSort(arr);
    } 
}