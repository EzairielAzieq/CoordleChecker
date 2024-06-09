import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        wordDict d = new wordDict();
        Scanner sc = new Scanner(System.in);
        BST tree = d.tree;

        System.out.println("Enter a word: ");
        String word = sc.next();
        if (tree.search(word.toLowerCase())) {
            System.out.println(word + " is a valid word");
        } else {
            System.out.println(word + " is not a valid word");
        }


    }
}
