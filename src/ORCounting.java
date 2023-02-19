import java.util.Scanner;

public class ORCounting {
    public static void main (String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);

        int num1 = convertToDecimal(in.nextLine());
        int num2 = convertToDecimal(in.nextLine());

        int count = 0;

        for(int i = 0; i<= num2; i++){

            if((num1 | i) == num2){
                count++;
            }
        }

        System.out.print(count);
    }

    public static int convertToDecimal(String number){


        int end = number.length()-1;
        String str = "";
        int start = 0;
        // System.out.println(end + " " + start);
        int sum = 0;
        int pow = 0;
        for(int i=end;i>=start;i--){
            char ch = number.charAt(i);
            if(ch == '1'){
                sum += Math.pow(2,pow);
            }
            pow++;
            // System.out.println("----> "+ch + " " + i+" "+sum);
        }
        return sum;
    }
}
