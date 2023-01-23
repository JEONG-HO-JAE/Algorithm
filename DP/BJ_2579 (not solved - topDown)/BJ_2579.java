import java.util.Scanner;
public class BJ_2579 {

    private int n;
    private int [] arr;
    private Integer [] p;

    public void solution(Scanner scanner){
        scanAndSet(scanner);
        //bottumUp(n);
        System.out.print(topDown(n));
    }

    private void scanAndSet(Scanner scanner){
        n = scanner.nextInt();
        arr = new int[n+1];
        p = new Integer[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = scanner.nextInt();
        }
        p[0] = 0;
        p[1] = arr[1];
    }

    private void  bottumUp(int n){
        if(n==1) System.out.print(p[n]);
        else if (n==2) {
            p[2] = arr[1] + arr[2];
            System.out.print(p[n]);
        }
        else if (n>=3) {
            p[2] = arr[1] + arr[2];
            for(int i = 3; i <= n; i++) p[i] = Math.max(p[i-2], p[i-3]+arr[i-1]) + arr[i];
            System.out.print(p[n]);
        }

    }

    private int topDown(int n){
        if(n == 2)  p[2] = arr[1]+arr[2];
        else if (n >= 3)  p[n] = Math.max(topDown(n-3)+arr[n-1], topDown(n-2)) + arr[n];
        return p[n];
    }

}
