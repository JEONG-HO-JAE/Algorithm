import java.util.Scanner;
public class BJ_15650 {
    private int m,n;
    private int [] arr;

    private StringBuilder sb = new StringBuilder();

    public void solution(Scanner scanner){
        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[m];
        dfs(1,0);
        System.out.print(sb);
    }

    private void dfs(int at, int depth){
        if(depth == m){
            for( int i = 0; i < arr.length ; i++) sb.append(arr[i]).append(' ');
            sb.append("\n");
            return;
        }
        for( int i  = at ; i <= n ; i++){
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}

/* My solution*/

//        import java.util.Scanner;
//
//public class Main {
//    static Scanner scanner;
//    static int n,m;
//    static int depth = -1;
//    static boolean[] state;
//
//    public static void main(String[] args) {
//        scanner = new Scanner(System.in);
//        n = scanner.nextInt(); m = scanner.nextInt();
//        state = new boolean[n];
//        Arrays.fill(state, false);
//
//        dfs(depth, 0);
//    }
//
//    public static void dfs(int depth, int now){
//        if(now == m){
//            print ();
//        }
//        else if (depth == n-1){}
//        else {
//            depth++;
//            state[depth] = true;
//            dfs(depth, now+1);
//            state[depth] = false;
//            dfs(depth, now);
//        }
//    }
//
//    public static void print () {
//        int count = 0;
//        for (int i = 0; i < state.length; i++) {
//            if (state[i] && count != m-1){ System.out.print(i + 1 + " "); count ++;}
//            else if (state[i] && count == m-1) System.out.println(i + 1);
//        }
//
//    }
//}