package trie;

public class trie1 {

    class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // Array for 26 lowercase English letters
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root;

    // Constructor to initialize root
    public trie1() {
        root = new Node();
    }

    public void insert(String key) {
        Node currentNode = root; // Start from the root

        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new Node();
            }
            currentNode = currentNode.children[index];
        }

        // Mark the last node as the end of a word
        currentNode.endOfWord = true;
    }

    public static boolean search(String key) {
        Node currentNode = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (currentNode.children[index] == null) {
                return false;
            }

            currentNode = currentNode.children[index];
        }
        return currentNode.endOfWord == true;
    }

    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i < key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if (search(firstPart) && wordbreak(secondPart)) {
                return true;
            }

        }
        return false;
    }

    public static boolean startWith(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
          
             if(curr.children[idx] == null){
                return false;

               
             }
             curr = curr.children[idx];
        }
   return true;

    }

    public static int CountNode(Node root){
        Node curr = root;
        if(curr == null){
            return 0;
        }
        int count = 0;

        for(int i=0;i<26;i++){
            if(curr.children[i] != null){
                count += CountNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        trie1 trie = new trie1();
        // String keys[] = { "the", "a", "there", "their", "any" };

        // for (int i = 0; i < keys.length; i++) {
        //     trie.insert(keys[i]);
        // }

        // System.out.println("Words inserted successfully.");

        // System.out.println(search("the"));
        // System.out.println(search("these"));
        // System.out.println(search("their"));

        // String key = "the";

        //System.out.println(wordbreak(key));

        // String word[]={"apple","mango","banana","grapes"};
        // for(int i=0;i<word.length;i++){
        //     trie.insert(word[i]);
        // }
        // System.out.println(startWith("app"));

        String word = "ababa";
        for(int i=0;i<word.length();i++){
            String suffix=word.substring(i);
            trie.insert(suffix);
        }
        System.out.println(CountNode(root));
    }
}
