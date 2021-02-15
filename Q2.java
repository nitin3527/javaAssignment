import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Q2 {
    public static void main(String[] args) {
            String str = "Horse have four legs and one nose where as human have two legs and one nose";
            str = str.toLowerCase();
            String words[] = str.split(" ");
            List<String> repeadedWords = new ArrayList<String>(words.length);

            for(int i=0; i<words.length; i++){
                int count = 1;
                for (int j=i+1; j<words.length; j++){
                    if(words[i].equals(words[j])){
                        count++;
                        words[j] = "0";
                    }
                }
                if(count > 1 && words[i] != "0"){
                    System.out.println(words[i] + ": " + count);
                    repeadedWords.add(words[i]);
                }
            }
            for(int i=0;i<repeadedWords.size();i++){
                System.out.println(repeadedWords.get(i));
            }
    }
}
