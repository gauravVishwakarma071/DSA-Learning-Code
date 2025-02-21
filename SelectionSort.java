public class SelectionSort{

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[]){

        int[] arr = {6,3,7,2,9};

        for(int i = 0;i < arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }
}