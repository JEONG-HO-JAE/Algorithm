import java.util.*;
public class PG_위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0) +1);
        }

        Set <String> set = map.keySet();
        for(String type : set){
            answer *= (map.get(type) + 1);
        }

        return answer-1;
    }
}

