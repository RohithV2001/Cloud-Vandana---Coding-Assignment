import java.util.Random;

public class MyClass {
    	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		System.out.println("Original Array:");
		printArray(arr);
		System.out.println("Shuffled Array:");
		shuffledArray(arr);
		printArray(arr);
	}
	
	public static void printArray(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        System.out.println(arr[i]+" ");
	    }
	}
	public static void shuffledArray(int[] arr){
	    int l=arr.length;
	    for(int i=l-1;i>=1;i--){
	        int idx = new Random().nextInt(i+1);
	        swap(arr, i, idx);
		}
	}
        private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}