import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte cases = in.nextByte();

        while (cases-- > 0) {
            short M = in.nextShort();
            short N = in.nextShort();

            in.nextLine();
            for (short i = 0; i < M; i++) {
                String str = in.nextLine();
                String[] arr = str.split("\\s+");
                //System.out.println(str);
                boolean foundit = false;
                for (short j = 0; j < arr.length; j++) {
                    if (arr[j].equals("1")) {
                        foundit = true;
                        break;
                    }
                }
                //System.out.println(i);
                for (short j = 0; j < N; j++) {
                    System.out.print((foundit ? 1 : 0) + " ");
                }
                System.out.println();
            }
        }
    }
}
