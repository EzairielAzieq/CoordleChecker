import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class wordDict {
    BST tree = new BST();

    public wordDict() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/words.txt"));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                tree.insert(line);
            }
            reader.close();
        } catch (IOException o) {
            System.out.println(o);
        } 
    }
}
