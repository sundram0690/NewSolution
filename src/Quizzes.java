import java.util.Scanner;

public class Quizzes {
    public static void main(String[] args) {

//        int [] arr = {1,2,3,4,5};
//        for(int i =0;i<arr.length-2;++i){
//            System.out.println(arr[i] + " ");
//        }

        int value = 0;
        int N = (new Scanner(System.in).nextInt());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(++value);
            }
            System.out.println();
        }

//        int[] arr = new int[0];
//        System.out.println(arr.length);
//
//        System.out.printf("%d",arr);
    }
    
}
