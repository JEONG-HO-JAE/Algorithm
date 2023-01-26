import java.util.Scanner;

public class BJ_1476 {
    private int E, S, J;
    private int count = 0;

    public void solution(Scanner scanner){
        E = scanner.nextInt(); S = scanner.nextInt(); J = scanner.nextInt();
        System.out.println(rotate());
    }
    private int rotate(){
        int e,s,j; e = 0; s = 0; j = 0;

        while(!(e == E && s == S && j == J)){
            if(++e == 16) e = 1;
            if(++s == 29) s = 1;
            if(++j == 20) j = 1;
            count++;
        }

        return count;
    }
}
