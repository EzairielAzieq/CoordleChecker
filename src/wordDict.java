import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordDict {
    public BST tree;

    public wordDict() {
        tree = new BST();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/words.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim().replaceAll("\"", "").toLowerCase();
                tree.insert(word);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}