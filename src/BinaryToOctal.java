import java.util.Scanner;

public class BinaryToOctal {
    public static void main (String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String number = in.nextLine();

        int end = number.length()-1;
        String str = "";
        while(end >=0){
            int start = end - 2;
            if(start < 0){
                start = 0;
            }
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
            end = start -1;
            str = sum + str;
        }

        System.out.print(str);

    }
}
