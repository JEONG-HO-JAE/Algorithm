import java.util.Scanner;

public class BJ_11047 {
    private int n;
    private int k;
    private int[] arr;
    private int count = 0;
    public void solution(Scanner scanner){
        n = scanner.nextInt(); k = scanner.nextInt();
        arr = new int[n+1];

        for(int i = 1; i <= n; i++) arr[i] = scanner.nextInt();

        for(int j = n; j >= 1; j--){
            if(k >= arr[j]){
                int temp = arr[j];
                int num = k / temp;
                k = k - num * temp;
                count += num;

                if(k == 0) {
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
