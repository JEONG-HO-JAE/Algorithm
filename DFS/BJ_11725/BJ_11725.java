import java.util.*;

public class BJ_11725 {
    private int [] parent;
    private int  n;
    private ArrayList<Integer>[] list;

    public void solution(Scanner scanner){
        setAndScan(scanner);
        parent[1] = 1;
        dfs(1);
        for(int i =2; i < parent.length; i++) System.out.println(parent[i]);
    }
    private void setAndScan(Scanner scanner){
        n = scanner.nextInt();
        parent = new int[n+1];
        list = new ArrayList[n+1];
        for(int i=1; i<=n; i++)  list[i] = new ArrayList<>();

        for(int i = 1; i <n; i++){
            int x = scanner.nextInt(); int y = scanner.nextInt();
            list[x].add(y); list[y].add(x);
        }
    }
    private void dfs(int i){
        for(int j = 0; j < list[i].size(); j++){
            int temp = list[i].get(j);
            if(parent[temp] == 0) { parent[temp] = i; dfs(temp);}
        }
    }


}
