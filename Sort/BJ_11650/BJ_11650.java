import java.util.*;

public class BJ_11650 {
    private int n;

    class Loc implements Comparable<Loc> {
        int x;
        int y;
        Loc(int x, int y){this.x =x; this.y=y;}

        public void print(){
            System.out.println(x+" "+y);
        }

        @Override
        public int compareTo(Loc cur){
            if(this.x == cur.x){
                if(this.y < cur.y) return -1;
                else if (this.y > cur.y) return 1;
                else return 0;
            }
            else{
                if(this.x > cur.x) return 1;
                else if (this.x < cur.x) return -1;
                else return 0;
            }

        }
    }

    public void solution (Scanner scanner) {
        n = scanner.nextInt();
        StringBuilder sb  = new StringBuilder();
        ArrayList <Loc> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            Loc cur = new Loc(scanner.nextInt(), scanner.nextInt());
            list.add(cur);
        }

        Collections.sort(list);
        Collections.sort(list);
        for(int i = 0; i < n; i++) list.get(i).print();


    }
}
