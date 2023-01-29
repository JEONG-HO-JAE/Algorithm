import java.util.*;
public class PG_배스트앨범 {

    class Music{
        int index;
        String genres;
        int count;
        public Music (int index, String genres, int count){
            this.index = index; this.genres = genres; this.count = count;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }

        // 장르 <Key 값> 내림 차순으로 정렬
        Set <String> keySet = map.keySet();
        List <String> keyList = new ArrayList<>();

        for(String s : keySet){keyList.add(s);}
        Collections.sort(keyList, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return map.get(s2) - map.get(s1);
            }
        });


        // 장르 별로 접근하여 장르 별 ArrayList 만들고 노래 조회수 내림차순 정렬
        List <Integer> answerList = new ArrayList<>();
        for(String s : keyList){
            List <Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++){
                if(s.equals(genres[i])) {list.add(new Music(i, genres[i], plays[i]));}
            }
            Collections.sort(list, (a, b) -> b.count-a.count);
            answerList.add(list.get(0).index);
            answerList.add(list.get(1).index);
        }

        answer = new int[answerList.size()];
        int k = 0;
        for(Integer i : answerList){
            answer[k++] = i;
        }

        return answer;
    }
}
