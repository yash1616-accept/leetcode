class WordDictionary {
    public class node {
        node children[] = new node[27];
        boolean eow = false;

        node() {
            for (int i = 0; i < 27; i++) {
                children[i] = null;
            }
        }
    }

    node root;

    public WordDictionary() {
        root = new node();
    }

    public void addWord(String word) {
        node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new node();
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public boolean search(String word) {
        return searchh(word, 0, root);

    }

    public boolean searchh(String word, int index, node curr) {

        if (index == word.length())
            return curr.eow;
        char ch = word.charAt(index);
        if (ch != '.') {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            return searchh(word, index + 1, curr.children[idx]);
        } else {
            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    if (searchh(word, index + 1, curr.children[i])) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */