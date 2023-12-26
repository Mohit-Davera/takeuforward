package testing;

public class TextJustification {
    public static void main(String[] args) {
        int[] arr = {8,6,2,5,1};
        int n = arr.length;
        int index = 0;
        for(int i = 0;i<n;i++){
            int min = arr[i];
            index =  i;
            for(int j = i + 1;j<n;j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
