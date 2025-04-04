class Sorting{

    //printing sorted Arrays
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
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
        System.out.print("BY bubble sort");
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
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
        System.out.print("BY selection sort");
        print(arr);
    }
    public static void main(String[] args){
        
        int[] arr = {5,4,8,2,6};
        selectionSort(arr);
    } 
}