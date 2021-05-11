/**
Write a program to reverse an array or string
Input : arr[] = [1,2,3]
Output : arr[] = [3,2,1]
*/

class A1 {
    
    public void reverseArray(int[] arr) {
        int start=0, end=arr.length-1;
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    
    public void printArray(int[] arr) {
        for(int x:arr) {
            System.out.print(x+" ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        printArray(arr);
    }
    
}
