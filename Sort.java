package com.jcloud.recordcenter;

public class Delete {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 2, 3, 5, 1, 12, 5, 23, 3, 1, 2};
//        sort(arr, arr.length);
        sort2(arr, 0, arr.length - 1);
        System.out.println("aaa");
    }

    private static void sort2(int[] arr, int beg, int end) {
        if (beg >= end) {
            return;
        }
        int p = arr[beg];
        int i = beg;
        int j = end;
        while (i < j) {
            while (arr[j] >= p && i < j) {
                j--;
            }
            while (arr[i] <= p && i < j) {
                i++;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        arr[beg]=arr[i];
        arr[i]=p;
        sort2(arr,beg,j-1);
        sort2(arr,j+1,end);
    }

    private static void sort(int[] arr, int length) {
        int j, k;
        int flag = length;
        while (flag > 0) {
            k = flag;
            flag = 0;
            for (j = 1; j < k; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = j;
                }
            }
        }
    }
}
