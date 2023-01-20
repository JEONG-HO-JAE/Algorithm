
import java.util.Scanner;

public class BJ_9095 {
    private int n;
    private int [] a;
    private int [] res;

    public void solution (Scanner scanner) {
        n = scanner.nextInt();
        a = new int[11];
        a[1] = 1; a[2] = 2; a[3] = 4;
        res = new int[n];

        for( int i = 0 ; i < n ; i++){
            res[i]=func(scanner.nextInt());
        }
        for( int i = 0 ; i < n ; i++){
            System.out.println(res[i]);
        }

    }

    private int func(int n){
        if(n>=4){
            a[n] = func(n-3) + func(n-2) + func(n-1);
        }
        return a[n];
    }
}
