// ***44% Score***
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] A = {-3, 1, 2, -2, 5, 6};
//        int[] A = {2, 8, 2, 4, 5, 6};
//        int[] A = {10, 10, 10};
//        int[] A = {-3, 1, 2, -2, 5, 6};
//        int[] A = {-3, 1, 2, -2, 5, 6};
//        int[] A = {-5, 5, -5, 10};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int length = A.length - 1;
        int max = 0;
        int mid = 0;
        int min = 0;
        int[] newArray = new int[A.length];
        int newLength = newArray.length - 1;

        for(int i = 0; i <= length; i++) {
            if(A[i] < -1000 || A[i] > 1000) {
                System.out.println("Invalid Range");
                System.exit(0);
            }
        }

        if(length < 2 || length > 100001) {
            System.out.println("Invalid Range");
            System.exit(0);
        }

        for(int i = 0; i <= length; i++) {
            newArray[i] += Math.abs(A[i]);
        }

        Arrays.sort(A);

        for(int i = 0; i <= length; i++) {
            max = A[length];
            mid = A[length - 1];
            min = A[length - 2];
        }
        return max * mid * min;
    }
}
