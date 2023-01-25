import java.util.*;
public class BJ_10451 {
    private int n;
    private int [] arr;
    public void solution(Scanner scanner){
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            int j = scanner.nextInt();
            arr = new int [j+1];
            for(int k = 1; k <= j; k++) arr[k] = scanner.nextInt();
            inspec(arr);
            scanner.nextLine();
        }
    }
    private void inspec(int[] arr){
        int count = 0;
        int i = 1;
        boolean [] visit = new boolean[arr.length];
        while(i != arr.length){
            if(!visit[i]){
                go(arr, visit, i);
                count++;
            }else i++;
        }
        System.out.println(count);
    }
    private void go(int[] arr, boolean[]visit, int  i){
        if(!visit[i]){
            visit[i] = true;
            go(arr,visit,arr[i]);
        }
    }
}
