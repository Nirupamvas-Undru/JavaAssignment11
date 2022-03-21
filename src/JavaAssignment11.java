import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class JavaAssignment11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try{
            String fileName;
            System.out.println("Enter file name: ");
            fileName = keyboard.nextLine();
            PrintWriter pw = new PrintWriter(fileName);
            HashMap<Character, Integer> charCountMap
                    = new HashMap<Character, Integer>();
            char[] strArray = fileName.toCharArray();
            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                }
                else {
                    charCountMap.put(c, 1);
                }
            }
            for (Map.Entry entry : charCountMap.entrySet()) {
                pw.println(entry.getKey() + " " + entry.getValue());
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }//end try-catch
    }
}
