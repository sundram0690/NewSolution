import java.util.Scanner;
public class Triples {
    public static void main(String[] args) {
                // Your code here
                Scanner in = new Scanner(System.in);

                int N = in.nextInt();
                int K = in.nextInt();

                System.out.println(N + ","+K + " : ");
                findTriples(N,K);

            }
    public static void findTriples(int N,int K){


        int count = 0;

        for(int a=1;a<=N;a++){
            for(int b=1;b<=N;b++){
                for(int c=1;c<=N;c++){
                    boolean case1 = (a + b) % K == 0;
                    boolean case2 = (b + c) % K == 0;
                    boolean case3 = (c + a) % K == 0;

                    boolean finalresult = case1 && case2 && case3;

                    if(finalresult){
                        count++;
                        System.out.printf("---------- %d %d %d\n",a,b,c);
                    }else {
                        System.out.printf("%d %d %d\n",a,b,c);
                    }

                }
            }
        }

        System.out.println(+count);
    }

    public static void findTriple(int N,int K){


        int count = 0;

        for(int a=1;a<=N;a++){
            for(int x=1;x<=N;x++) {

            }
        }

        System.out.println(+count);
    }
        }
