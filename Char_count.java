import java.util.*;
import java.io.*;
public class Char_count{
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> characterCount = new TreeMap<Character, Integer>();
        for(char c='a';c<='z';c++){
            characterCount.put(c,0);
        }
        File file = new File("/home/zadmin/file_char_count"); // input file
        FileWriter fw = new FileWriter("/home/zadmin/outputfile.txt"); // output file
        Scanner sc= new Scanner(file);
        char[] chars = sc.nextLine().toLowerCase().toCharArray();
        for (Character ch : chars) {
            if(Character.isLetter(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            String s=entry.getKey()+" : "+ entry.getValue() + "\n";
            fw.write(s);

        }
        fw.close();
    }
}