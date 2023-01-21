import java.util.HashSet;
import java.util.Scanner;

public class BJ_11507 {
    private HashSet<String> hs = new HashSet<>();
    private int[] cnt = new int[4];

    public void solution (Scanner scanner){
        String str = scanner.next();

        for (int i = 0; i < str.length(); i+=3) {
            String cur = str.substring(i, i+3);
            if (hs.contains(cur)) {
                System.out.println("GRESKA");
                return;
            }
            hs.add(cur);

            switch (cur.charAt(0)) {
                case 'P' : cnt[0]++; break;
                case 'K' : cnt[1]++; break;
                case 'H' : cnt[2]++; break;
                case 'T' : cnt[3]++; break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(13-cnt[i]).append(' ');
        }
        System.out.println(sb);

    }


}

//    private boolean [] P = new boolean[14];
//    private boolean [] K = new boolean[14];
//    private boolean [] H = new boolean[14];
//    private boolean [] T = new boolean[14];
//
//    private int count;
//
//    public void solution (Scanner scanner){
//        int x = 0;
//        int y = 1;
//        int z = 2;
//        String temp = scanner.next();
//        while(z < temp.length()){
//            char ind = temp.charAt(x);
//            int i = (temp.charAt(y) - '0') * 10 + (temp.charAt(z) - '0');
//            x+=3;y+=3;z+=3;
//            if(!inspec(ind, i)) return;
//        }
//
//        print();
//    }
//
//    private void print(){
//        count = 13;
//        for(int i = 1; i < 14; i++) if(P[i]) count --;
//        System.out.print(count + " ");
//
//        count = 13;
//        for(int i = 1; i < 14; i++) if(K[i]) count --;
//        System.out.print(count + " ");
//
//        count = 13;
//        for(int i = 1; i < 14; i++) if(H[i]) count --;
//        System.out.print(count + " ");
//
//        count = 13;
//        for(int i = 1; i < 14; i++) if (T[i]) count --;
//        System.out.print(count);
//    }
//
//    private boolean inspec(char ind, int i){
//        switch (ind){
//            case 'P':
//                if (P[i]) {
//                    System.out.print("GRESKA");
//                    return false;
//                }
//                P[i] = true;
//                break;
//            case 'K':
//                if (K[i]) {
//                    System.out.print("GRESKA");
//                    return false;
//                }
//                K[i] = true;
//                break;
//            case 'H':
//                if (H[i]) {
//                    System.out.print("GRESKA");
//                    return false;
//                }
//                H[i] = true;
//                break;
//            case 'T':
//                if (T[i]) {
//                    System.out.print("GRESKA");
//                    return false;
//                }
//                T[i] = true;
//                break;
//        }
//        return true;
//    }