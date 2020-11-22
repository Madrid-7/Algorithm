package 寻找第K大;


public class Main {
    public int findKth(int[] a, int n, int K) {
        quickSort(a,0,a.length-1);
        return a[n-1-K+1];
    }

    //快排
    public void quickSort(int[] a,int low,int high){

        if(low > high){
            return;
        }

        int i = low;
        int j = high;

        int temp = a[low];

        while (i<j){
            while (i<j && temp <= a[j]){
                j--;
            }

            while (i<j && temp >= a[i]){
                i++;
            }

            if(i<j){
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
        }

        a[low] = a[j];
        a[i] = temp;

        quickSort(a,low,j-1);
        quickSort(a,j+1,high);
    }
}
