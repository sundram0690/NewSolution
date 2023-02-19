import java.util.Scanner;

public class BinaryToHexadecimalUpdated {
    public static void main (String[] args) {
        // Your code here

        // Your code here
        // Your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String number = in.nextLine();

        int end = num -1;
        StringBuffer str = new StringBuffer ("");
        while(end >=0){
            int start = end - 3;
            if(start < 0){
                start = 0;
            }
            //System.out.println(end + " " + start);
            int sum = 0;
            int pow = 0;
            for(int i=end;i>=start;i--){
                char ch = number.charAt(i);
                if(ch == '1'){
                    sum += Math.pow(2,pow);
                }
                pow++;
                //System.out.println("----> "+ch + " " + i+" "+sum);
            }
            char Hex = '0';
            if(sum > 9){
                if(sum == 10) Hex = 'A';
                if(sum == 11) Hex = 'B';
                if(sum == 12) Hex = 'C';
                if(sum == 13) Hex = 'D';
                if(sum == 14) Hex = 'E';
                if(sum == 15) Hex = 'F';
            }else{
                Hex= (char)(48+sum);
            }
            end = start -1;
            str.insert(0,Hex);
        }

        System.out.print(str);




    }
}
