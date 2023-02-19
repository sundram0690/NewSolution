import java.util.Scanner;

public class AllNumber {
    public static void main (String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        Double min_d = new Double(Math.pow(2,number-1));
        Double max_d = new Double(Math.pow(2,number)-1);

        int min = min_d.intValue();
        int max = max_d.intValue();

        for(int i = min; i<= max ; i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
