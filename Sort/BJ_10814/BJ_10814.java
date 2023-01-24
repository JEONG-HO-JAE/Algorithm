import java.util.*;

public class BJ_10814 {
    private int n;

    class Person implements Comparable<Person> {
        int age;
        String name;
        Person(int age, String name){this.age = age; this.name = name;}

        @Override
        public int compareTo(Person p){
            return this.age-p.age;
        }
    }

    public void solution(Scanner scanner){
        n = scanner.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int age = scanner.nextInt();
            String name = scanner.next();
            list.add(new Person(age,name));
        }
        Collections.sort(list);
        for(int i = 0; i < n; i++){
            System.out.println(list.get(i).age + " " +list.get(i).name);
        }

    }

}
