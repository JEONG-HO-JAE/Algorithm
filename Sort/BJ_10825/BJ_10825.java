import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_10825 {
    private int n;

    public void solution(Scanner scanner){
        n = scanner.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0; i < n; i++){
            list.add(new Student(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(list);
        for(int i=0; i < n; i++) System.out.println(list.get(i).getName());
    }
}
class Student implements Comparable<Student> {
    private String name;
    private int kr;
    private int eng;
    private int math;
    Student (String name, int kr, int eng, int math){this.name = name; this.kr = kr; this.eng = eng; this.math = math;}

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Student s){
        if( this.kr == s.kr){
            if(this.eng == s.eng){
                if(this.math == s.math){
                    return this.name.compareTo(s.name);
                }else{
                    if(this.math < s.math) return 1;
                    else return -1;
                }
            }else {
                if(this.eng < s.eng) return -1;
                else return 1;
            }
        }
        else {
            if (this.kr < s.kr) return 1;
            else return -1;
        }
    }
}
