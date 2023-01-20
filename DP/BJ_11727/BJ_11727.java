import java.util.Scanner;

public class BJ_11727 {
    private int n;
    private int [] arr;
    public void solution (Scanner scanner) {
        n = scanner.nextInt();
        arr = new int[n + 1];
        System.out.println(func(n));
    }

    private int func(int n){
        if(n==1) return 1;
        else {
            arr [1] = 1;
            arr [2] = 3;
            if( arr[n] == 0 ) arr[n] = ((func(n-2)*2+func(n-1))) % 10007;
        }
        return arr[n];
    }
}
