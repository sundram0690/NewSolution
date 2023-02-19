public class Complexity {
    public static void main(String[] args) {
        int i = 1, s = 1;
        int n = 32 ;
        while(s < n){
            System.out.println(i +" -> "+s+" : "+n);
            s = s+i;
            i++;

        }

    }
}
