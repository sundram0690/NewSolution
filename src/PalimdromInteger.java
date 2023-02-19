public class PalimdromInteger {
    public static void main(String[] args) {
        checkPalindrome(1234321);
    }

    public static void checkPalindrome(int N){
        int left = N;
        int right = 0;

        while(right < left){
            right = 10*right + left%10;
            left /= 10;
        }
        if(N%10 != 0){
            if(right == left) System.out.println("Yes");
            else if (right>left) {
                right /= 10;
                if (right==left) System.out.print("Yes");
                else System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}
