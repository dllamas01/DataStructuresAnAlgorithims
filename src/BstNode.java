public class BstNode {
    int key;
    String name;
    // BST can only have 1 left and 1 right
    // A little linked lists
    BstNode leftChild;
    BstNode rightChild;
    BstNode( int key, String name) {
        this.key = key;
        this.name = name;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder( "\n - Name:" + name);
        sb.append( " key:" + key);
        return sb.toString();
    }
}
