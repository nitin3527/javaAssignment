import java.util.HashSet;
import java.util.Set;

public class Q5 {
    public void findCommon(String[] str1, String[] str2){
        Set<String> commonWords = new HashSet<>();
        for(int i=0; i<str1.length; i++){
            for(int j=0; j<str2.length; j++){
                if(str1[i] == str2[j]){
                    commonWords.add(str1[i]);
                    break;
                }
            }
        }
        System.out.println("Common elements are: ");
        for(String i:commonWords) System.out.println(i);
    }
    public static void main(String[] args) {
        Q5 common = new Q5();
        String[] st1 = {"this", "is", "my", "first", "string"};
        String[] st2 = {"this", "is", "my", "second", "string"};
        common.findCommon(st1, st2);
    }
}
