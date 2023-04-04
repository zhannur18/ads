//2
public class Average {

    public static void main(String[] args) {
        int[] arr = {3,2,4, 1};
        double avg = findAvr(arr, 4);
        System.out.println(avg);
    }
    public static double findAvr(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }else{
            return ((n - 1) * findAvr(arr, n - 1) + arr[n - 1]) / n;
        }
    }
}
