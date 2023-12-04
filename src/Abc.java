import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {
//        int [] arr = {1,23,4,5};
//        System.out.println(Arrays.toString(arr));
//        int[]nums;
//        nums = new int[5];
//
//        nums[0] = 12;
//        nums[1] = 23;
//        nums[2] = 34;
//        nums[3] = 45;
//        nums[4] = 56;
//
//        System.out.println(arr[1]);

        int [] rno ;
        rno = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for (int i = 0; i < rno.length; i++) {
            rno[i] = in.nextInt();
        }

        for (int i = 0; i < rno.length; i++) {
            System.out.println(rno[i]);

        }
        System.out.println(Arrays.toString(rno));
    }
}
