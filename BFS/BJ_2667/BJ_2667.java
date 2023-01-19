import java.util.*;
public class BJ_2667 {

    private int [] dx = {-1,1,0,0};
    private int [] dy = {0,0,-1,1};
    private boolean [][] visit;
    private char [][] arr;
    private int [] result;
    private int num = 0;

    private Queue<Node> q= new LinkedList<Node>();

    class Node{
        private int x, y;
        Node(int x, int y)  {this.x = x; this.y = y;}
    }

    public void solution (Scanner scanner) {
        scanAndSet(scanner);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(!visit[i][j] && arr[i][j] == '1') bfs(new Node(i, j));
            }
        }

        System.out.println(num);
        int [] ans = new int [num];
        ans = Arrays.copyOf(result,num);
        for(int i = 0; i < num; i++)
            System.out.println(ans[i]);

    }

    private void scanAndSet(Scanner scanner){
        int t = scanner.nextInt();

        arr = new char [t][t];
        visit = new boolean [t][t];
        result = new int [t*t];

        for(int i = 0; i < t; i++){
            arr[i] = scanner.next().toCharArray();
        }

    }

    private void bfs(Node node){
        q.add(node);

        while (!q.isEmpty()){
            Node temp = q.poll();
            for (int i = 0; i < 4; i++){
                Node cur = new Node ( temp.x + dx[i], temp.y + dy[i] );
                if(isIn(cur.x, cur.y))
                    if(isApt(cur.x, cur.y))
                        if(isFirst(cur.x, cur.y)){
                            q.add(cur);
                            visit[cur.x][cur.y]=true;
                            result[num]++;
                        }
            }
        }

        num++;

    }

    private boolean isIn(int x, int y){
        if ( x >= 0 && x < arr.length && y >= 0 && y < arr.length ) return true;
        else return false;
    }
    private boolean isApt(int x, int y){
        if ( arr[x][y] == '1') return true;
        else return false;
    }

    private boolean isFirst(int x, int y){
        if ( !visit[x][y] ) return true;
        else return false;
    }


}


