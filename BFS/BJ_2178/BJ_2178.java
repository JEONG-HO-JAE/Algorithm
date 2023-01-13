import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2178 {
    int x=0; int y=0;
    boolean visited [][];
    char[][] map;
    int [] dx = {-1, 1, 0, 0};
    int [] dy = {0, 0, -1, 1};
    Queue<Loc> q = new LinkedList<>();

    class Loc {
        int x, y;
        int dest;
        Loc (int x, int y, int dest) {this.x=x; this.y=y; this.dest=dest;}
    }

    int solution(){
        Scanner scanner = new Scanner(System.in);
        setElement(scanner);
        Loc now = new Loc(0,0,1);
        visited[now.x][now.y]=true;

        Loc next;
        q.add(now);

        while(!q.isEmpty()){
            now = q.poll();
            for( int i = 0; i < 4 ; i++ ){
                next = new Loc(now.x + dx[i], now.y + dy[i], now.dest);
                if( isIn(next) && !isVisited(next) && isOne(next)) {
                    visited[next.x][next.y]=true;
                    next.dest++; q.add(next);
                    if( next.x == x-1 && next.y == y-1) return next.dest;
                }
            }
        }
        return 1;
    }

    void setElement(Scanner scanner){
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.nextLine();
        visited = new boolean[x][y];
        map = new char[x][y];
        for ( int i = 0; i < x ; i++ ) {
            String temp = scanner.nextLine();
            for (int j = 0; j < y ; j++){
                map[i][j] = temp.charAt(j);
                visited[i][j]= false;
            }
        }

    }

    boolean isIn (Loc loc){
        if ( loc.x < x && loc.x >= 0 && loc.y < y && loc.y >= 0 ) return true;
        else return false;
    }

    boolean isVisited(Loc loc){
        if(visited[loc.x][loc.y]) return true;
        else return false;
    }

    boolean isOne(Loc loc){
        if(map[loc.x][loc.y] == '1') return true;
        else return false;
    }
}


/** Alternative for if I can't not use inner or outer class**/
//    static int x;
//    static int y;
//    static char map [][];
//    static boolean visited[][];
//    static int []dx = {-1,1,0,0};
//    static int []dy = {0,0,-1,1};
//    static int []loc = new int[3];
//
//
//    static public void main (String[] args){
//        Scanner scanner = new Scanner(System.in);
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        scanner.nextLine();
//        map = new char [x][y];
//        visited = new boolean [x][y];
//
//        for(int i = 0; i < x; i++){
//            String temp = scanner.nextLine();
//            for(int j = 0; j < y; j++){
//                map[i][j] = temp.charAt(j);
//
//                visited[i][j] = false;
//            }
//
//        }
//
//        Queue <int []> q = new LinkedList <>();
//        loc[0]=0; loc[1]=0; loc[2]=1;
//
//        visited[0][0] = true;
//        q.add(loc);
//
//        while (!q.isEmpty()){
//            loc = q.poll();
//            for( int i = 0; i < 4 ; i ++){
//                int[] next = new int[3];
//                next[0] = loc[0]+dx[i]; next[1] = loc[1]+dy[i]; next[2] = loc[2]+1;
//                if (isIn(next) && !isVisited(next) && isOne(next)){
//                    visited[next[0]][next[1]] = true;
//                    q.add(next);
//                    if(next[0] == x-1 && next[1] == y-1) System.out.print(next[2]);
//                }
//            }
//        }
//    }
//
//    public static boolean isIn(int[] loc){
//        if(loc[0]>=0 && loc[0]<x && loc[1]>=0 && loc[1]<y) return true;
//        return false;
//    }
//    public static boolean isVisited(int[] loc){
//        if(visited[loc[0]][loc[1]]) return true;
//        return false;
//    }
//    public static boolean isOne(int[] loc){
//        if(map[loc[0]][loc[1]]=='1') return true;
//        return false;
//    }
