import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlippingTheMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arrinput = br.readLine().split(" ");

        int M = Integer.parseInt(arrinput[0]);
        int N = Integer.parseInt(arrinput[1]);

        System.out.println(M+" "+N);
        boolean[][] arr = new boolean[M][N];
         int count = 0;
         exit:
         for(int i=0;i<M;i++){
             for(int j=0;j<N;j++){
                 // First Row
                 if(i-1 >=0 && j-1 >=0){
                     boolean temp = arr[i-1][j-1];
                     arr[i-1][j-1] = temp ? false : true;
                 }
                 if(i-1 >=0 && j>=0){
                     boolean temp = arr[i-1][j];
                     arr[i-1][j] = temp ? false : true;
                 }
                 if(i-1 >=0 && j+1 <N){
                     boolean temp = arr[i-1][j+1];
                     arr[i-1][j+1] = temp ? false : true;
                 }

                 // 2nd Row
                 if(i >=0 && j-1 >=0){
                     boolean temp = arr[i][j-1];
                     arr[i][j-1] = temp ? false : true;
                 }
                 if(i>=0 && j>=0){
                     boolean temp = arr[i][j];
                     arr[i][j] = temp ? false : true;
                 }
                 if(i>=0 && j+1 <N){
                     boolean temp = arr[i][j+1];
                     arr[i][j+1] = temp ? false : true;
                 }

                 // 3rd Row
                 if(i+1 <M && j-1 >=0){
                     boolean temp = arr[i+1][j-1];
                     arr[i+1][j-1] = temp ? false : true;
                 }
                 if(i+1 < M && j >=0){
                     boolean temp = arr[i+1][j];
                     arr[i+1][j] = temp ? false : true;
                 }
                 if(i+1 < M && j+1 < N){
                     boolean temp = arr[i+1][j+1];
                     arr[i+1][j+1] = temp ? false : true;
                 }

                 count++;
                 if(count == M*N){
                     break exit;
                 }
             }


         }


         for(int m=0;m<M;m++){
             for(int n=0;n<N;n++){
                 System.out.print((arr[m][n] ? 1 : 0)+" ");
             }
             System.out.println();
         }



        // for(int i=0;i<M;i++){
        //     for(int j=0;j<N;j++){
        //         if(arr[i][j]){
        //             countone++;
        //         }
        //     }
        // }
        long countone = Math.abs((M-2)*(N-2));
        System.out.print(countone);

    }
}

