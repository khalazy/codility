// ***44% Score***
// ***CURRENT WIP***
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
        int[] newArray = new int[A.length]; // unused array
        int newLength = newArray.length - 1; // unused variable

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

        for(int i = 0; i <= length; i++) { // unused loop to copy values from A into newArray and 
            newArray[i] += Math.abs(A[i]); // convert any negatives into positives
        }

        Arrays.sort(A); // sorts A in ascending order

        for(int i = 0; i <= length; i++) {
            max = A[length]; // the max value is the last value in sorted A 
            mid = A[length - 1]; // second largest value is last value - 1
            min = A[length - 2]; // third largest value is last value - 2
        }
        return max * mid * min;
    }
}
