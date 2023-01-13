import java.util.LinkedList;
import java.util.Queue;

public class BstDriver {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.addNode(4, "Apples");
        bst.addNode(10, "Bananas");
        bst.addNode(12, "Carrot");
        bst.addNode(15,"Donut");
        bst.addNode(18,"Eggs");
        bst.addNode(24,"Figs");
        bst.addNode(25,"games");
        bst.addNode(31,"Horse");
        bst.addNode(35,"Ice");
        bst.addNode(44,"Jack");
        bst.addNode(50,"Kyle");
        bst.addNode(66,"Loser");
        bst.addNode(70,"Mark");
        bst.addNode(90,"No");
        bst.inOrderTrav(bst.root);
        BstNode b = bst.findNode(16);
        System.out.printf("\nPre Order ---------->");
        bst.preOrderTrav(bst.root);
        System.out.printf("\nPost Order---------->");
        bst.postOrderTrav(bst.root);
        BstNode n = bst.smallestItem(bst.root);
        System.out.printf("\n ----Min:%s -------",n.key);
        System.out.printf("\nTree Sum: %s", addBST(bst.root));
    }
    public static int addBST(BstNode root){
        if(root == null)return 0;
        return(root.key + addBST(root.leftChild) + addBST(root.rightChild));
    }
    public static int addBSTnoRecurr(BstNode root){
        int sum = 0;
        Queue<BstNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            BstNode cur = que.poll();
            sum += cur.key;
            if(cur.leftChild!=null){
                que.add(cur.leftChild);
            }
            if(cur.rightChild!= null){
                que.add(cur.rightChild);
            }
        }
        return 0;
    }
}
