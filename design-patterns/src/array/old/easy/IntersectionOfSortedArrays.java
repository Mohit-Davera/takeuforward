package array.old.easy;

import java.util.ArrayList;

public class IntersectionOfSortedArrays {

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i < n && j < m){
            if(arr1[i] == arr2[j]){
                arrayList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                while (i < n && arr1[i] < arr2[j])
                    i++;
            }else{
                while (j<m &&arr2[j]<arr1[i]){
                    j++;
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int A[]={1,2,3,3,4,5,6,7};
        int B[]= {3,3,4,4,5,8};
        ArrayList<Integer> intersection = intersection(A,B);
        System.out.println(intersection);
    }
}
