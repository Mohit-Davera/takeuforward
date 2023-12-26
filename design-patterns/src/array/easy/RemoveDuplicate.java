package array.easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,2,2,3,4,4,5,5,5,6,6,6};

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println();
    }
}
