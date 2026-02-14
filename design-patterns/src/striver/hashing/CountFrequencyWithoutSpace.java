package striver.hashing;

public class CountFrequencyWithoutSpace {

    static void findCountsUsingNegative(int[] arr, int n){
        int i =0;
        while (i<n){
            if(arr[i] <=0){
                i++;
                continue;
            }
            if(arr[i]>0){
                int index = arr[i]-1;

                if(arr[index] <=0){
                    arr[index]-=1;
                    arr[i] = 0;
                }
                else {
                    arr[i] = arr[index];
                    arr[index] = -1;
                }
            }

        }
    }
    static void findCountsUsingModulo(int[] arr, int n)
    {
        for(int i = 0;i< n;i++){
            arr[i]-=1;
        }

        for(int i = 0;i< n;i++){
            arr[(arr[i]) % n] += n;
        }

    }
    // Driver program to test above functions
    public static void main(String[] args)
    {
        int[] arr = {2,3,2,3,5};

        /*findCountsUsingNegative(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 +" -> " + Math.abs(arr[i]));
        }*/

        findCountsUsingModulo(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 +" -> " + arr[i]/arr.length);
        }

    }
}

