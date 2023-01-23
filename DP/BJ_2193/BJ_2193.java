import java.util.Scanner;
public class BJ_2193 {

    private long arr [][];

    public void solution(Scanner scanner){
        int n = scanner.nextInt();
        arr = new long [n+1][2];
        arr [1][0] = 0; arr[1][1] = 1;

        for( int i = 2; i <= n; i++){
            arr [i][0] = arr[i-1][0] + arr[i-1][1];
            arr [i][1] = arr[i-1][0];
        }
        System.out.print(arr[n][0]+arr[n][1]);
    }
}
