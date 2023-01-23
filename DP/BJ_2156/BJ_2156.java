import java.util.Scanner;

public class BJ_2156 {
    private int n;
    private int [] arr;
    private int [] p;

    public void solution (Scanner scanner){
        scan(scanner);
        bottomUp();
    }
    private void scan(Scanner scanner){
        n = scanner.nextInt();
        arr = new int[n+1];
        p = new int[n+1];
        for (int i = 1; i <= n ; i++){
            arr[i] = scanner.nextInt();
        }
        p[1] = arr[1];
        p[0]  = 0;
        if(n > 1) p[2] = arr[1] + arr[2];
    }
    private void bottomUp(){
        for (int i = 3; i <= n; i++){
            p[i] =  Math.max(Math.max(p[i-3]+arr[i-1],p[i-2])+arr[i] , p[i-1]);
        }
        System.out.print(p[n]);
    }
//    private int topDown(int n){
//
//        if( p[n] == null){
//            p[n] = Math.max(Math.max(topDown(n-3)+arr[n-1],topDown(n-2))+arr[n] , topDown(n-1));
//        }
//        return p[n];
//
//    }
}
