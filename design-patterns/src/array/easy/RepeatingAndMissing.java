package array.easy;

public class RepeatingAndMissing {

    static void swapSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] != arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(j + 1 != arr[j]){
                System.out.println("Missing Number: " + (j + 1));
                System.out.print("Repeating Number: " + (arr[j]));
                break;
            }
        }
    }

    static void bruteNewArray(int[] arr){
        int length = arr.length;
        int[] temp = new int[length];
        int sum = 0;

        for (int j : arr) {
            temp[j - 1] += 1;
            sum += j;
        }

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == 2){
                System.out.println("Repeating Number: " + (i+1));
                System.out.println("Missing Number: " + ((length*(length+1))/2 - sum + (i+1)));
            }

        }
    }

    static void xorApproach(int[] arr){
        int x = 0;
        int y = 0;

        int xor1 = 0;

        for (int i :
                arr) {
            xor1 = xor1^i;
        }
        for (int i = 1; i < arr.length+1; i++) {
            xor1 = xor1^i;
        }
        System.out.println(xor1);

        int setBit = xor1 & -xor1;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & setBit) != 0)
                x = x ^ arr[i];
            else{
                y = y^ arr[i];
            }
        }

        for (int i = 1; i < arr.length + 1; i++) {
            if((i & setBit) != 0)
                x = x ^ i;
            else{
                y = y^i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if((x ^ arr[i]) == 0){
                System.out.println("Missing Number " + (x^xor1));
                System.out.println("Repeating Number " + (arr[i]));
                break;
            }
            if((y ^ arr[i]) == 0){
                System.out.println("Missing Number " + (y^xor1));
                System.out.println("Repeating Number " + (arr[i]));
                break;
            }
        }
    }
    public static void main(String[] args) {
        //swapSort(new int[]{2,3,1,5,1});
        xorApproach(new int[]{2,2 });
        System.out.println(Integer.toBinaryString(-3));
    }
}
