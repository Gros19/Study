package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = new int [10];
        for(int i = 0 ; i < arr.length; i++){
            arr[0]= i+1;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[0]);
        }
    }
}
