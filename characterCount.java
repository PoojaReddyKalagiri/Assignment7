import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class characterCount{
    public static void main(String[] args) throws Exception {

        Map<Character, Integer> characterCount = new TreeMap<Character, Integer>();
        File file = new File("/home/zadmin/file_char_count"); //input file
        FileWriter fw = new FileWriter("/home/zadmin/outputfile.txt");

        Scanner sc= new Scanner(file);
        while(sc.hasNextLine()) {
            char[] chars = sc.nextLine().toLowerCase().toCharArray();
            for (Character ch : chars) {
                if (characterCount.containsKey(ch)) {
                    characterCount.put(ch, characterCount.get(ch) + 1);
                }
                else
                    characterCount.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            String s=entry.getKey()+" : "+ entry.getValue() + "\n";
            fw.write(s);

        }
        
        fw.close();
    }
}