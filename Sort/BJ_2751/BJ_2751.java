import java.util.*;

public class BJ_2751 {
    private int n;
    private int [] arr;
    public void solution(Scanner scanner){

        n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) list.add(scanner.nextInt());
        Collections.sort(list);

        for(int i = 0; i < n; i++) System.out.println(list.get(i));
    }

}
