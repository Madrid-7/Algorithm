package BrokenKeyboard;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine().toUpperCase();
            String str2 = sc.nextLine().toUpperCase();
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            for (int i = 0; i <str1.length() ; i++) {
                if (!str2.contains(str1.charAt(i)+"")){
                    set.add(str1.charAt(i));
                }
            }
            Iterator i = set.iterator();
            while (i.hasNext()){
                System.out.print(i.next());
            }
        }
    }
}
