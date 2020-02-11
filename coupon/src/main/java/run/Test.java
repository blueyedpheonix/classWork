package run;

public class Test {
    public static boolean binerySerach(int search,int[]arry){
        int first = 0;
        int last = arry.length;
        int middle = last/2;
        while(first <= last){
            if (arry[middle] < search){
                first = middle + 1;
            }else if (arry[middle] > search){
                last = middle + 1;
            }
        }
    }
}
