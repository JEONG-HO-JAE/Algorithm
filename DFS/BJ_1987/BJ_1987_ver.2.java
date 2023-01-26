import java.nio.channels.Pipe;
import java.util.*;
public class BJ_1987 {
    private int row, column;
    private char[][] map;
    private boolean [] visit = new boolean[26];
    private int[] dx = {-1, 1, 0, 0};
    private int[] dy = {0, 0, -1, 1};
    private Queue<Point> list = new LinkedList<Point>();
    private int max = 0;

    public void solution(Scanner scanner){
        scanAndSet(scanner);
        Point now = new Point(1,1,1);visit[map[1][1] -'A'] = true;list.add(now);
        dfs(now);
        System.out.println(max);
    }
    private void scanAndSet(Scanner scanner){
        row = scanner.nextInt(); column = scanner.nextInt();
        map = new char[row+1][column+1];

        for(int i = 1; i <= row; i++){
            String temp = scanner.next();
            for(int j = 1; j <= column; j++){
                map[i][j] = temp.charAt(j-1);
            }
        }
    }

    private void dfs(Point now){
        while(!list.isEmpty()){
            Point cur = list.poll();
            for(int i = 0; i <= 3; i++){
                Point next = new Point(cur.x+dx[i], cur.y+dy[i], now.count+1);
                if(isIn(next) && !isVisit(next)){
                    list.add(next); visit[map[next.x][next.y] -'A'] = true;
                    dfs(next);
                }
            }
            visit[map[cur.x][cur.y] -'A'] = false;
            max = Math.max(max, cur.count);
        }
    }

    private boolean isIn(Point next){
        if(next.x>=1 && next.x<= row && next.y >= 1 && next.y<= column) return true;
        else return false;
    }
    private boolean isVisit(Point next){
        if(visit[map[next.x][next.y] - 'A']) return true;
        else return false;
    }

    class Point{
        public int x;
        public int y;
        public int count;
        Point(int x, int y, int count){this.x = x; this.y = y;this.count = count;}
    }
}
