import java.util.Scanner;

public class BJ_11057 {

    private int [][] p;

    public void solution (Scanner scanner){
        int n = scanner.nextInt();
        p = new int[n+1][10];
        for(int i = 0 ; i < 10 ; i++) p[1][i] = 1;

        for(int i = 2 ; i <= n ; i++) {
            for(int j = 0 ; j < 10 ; j++ ){
                 for(int k = 0; k <= j ; k++){
                    p[i][j] += p[i-1][k];
                 }
            }
        }

        int res = 0;
        for(int i = 0 ; i < 10; i++){
            res += p[n][i];
        }
        System.out.print(res%10007);

    }
}
