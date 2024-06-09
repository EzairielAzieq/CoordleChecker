import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        wordDict d = new wordDict();
        Scanner sc = new Scanner(System.in);
        BST tree = d.tree;

        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        if (tree.search(word)) {
            System.out.println(word + " is a valid word");
        } else {
            System.out.println(word + " is not a valid word");
        }


    }
}
