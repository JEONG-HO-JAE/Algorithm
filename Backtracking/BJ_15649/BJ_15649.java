import java.util.Arrays;
import java.util.Scanner;
public class BJ_15649 {

    private int depth = 0;
    private int x,y;
    private boolean []visit;
    private int [] arr;
    public void solution(Scanner scanner){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        visit = new boolean[x];
        arr = new int[x];
        func(depth);
    }

    private void func(int depth){
        if( depth == y ) {
            for(int i = 0; i < depth; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            for( int i = 0; i < x; i++) {
                if(!visit[i]){
                    int temp = depth;
                    visit[i] = true;
                    arr [temp] = i+1;
                    func(++temp);
                    visit[i] = false;
                }
            }
        }
    }


}
