public class BST {
    public BstNode root = null;
    public void inOrderTrav(BstNode focusNode){
        if(focusNode != null){
            inOrderTrav(focusNode.leftChild);
            System.out.printf("\n Node:%s Name:%s", focusNode.key, focusNode.name);
            inOrderTrav(focusNode.rightChild);
        }
    }
    public void preOrderTrav(BstNode focusNode){
        // Node traverse left then traverse right
        if(focusNode != null){
            System.out.printf("\n Node:%s Name:%s", focusNode.key, focusNode.name);

            preOrderTrav(focusNode.leftChild);

            preOrderTrav(focusNode.rightChild);
        }
    }
    public BstNode smallestItem(BstNode root){
        BstNode focus = root;
        while(focus.leftChild != null){
            focus = focus.leftChild;
        }
        return focus;
    }
    public void postOrderTrav(BstNode focusNode){
        // Node traverse left then traverse right
        if(focusNode != null){
            postOrderTrav(focusNode.leftChild);

            postOrderTrav(focusNode.rightChild);

            System.out.printf("\n Node:%s Name:%s", focusNode.key, focusNode.name);


        }
    }
    public BstNode findNode(int key){
        // Return null or the node
        BstNode focusNode = root;
        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;
            }else{
                focusNode =focusNode.rightChild;
            }
            if(focusNode == null){
                return null;
            }
        }
        return focusNode;
    }
    public void addNode(int key, String name){
        BstNode newNode = new BstNode(key,name);
        if(root==null){
            root = newNode;
        }else{
            // We already got a root
            BstNode focusNode = root;
            BstNode parent = root;
            int loopCt = 0;
            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    // Gonna go left
                    focusNode = focusNode.leftChild;
                    System.out.printf("\n To the Left CT: %s focus:%s",loopCt++,parent.key);
                    if(focusNode == null){
                        // leftChild has no children
                        // Set parent to newNode
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    // Got to go right
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        // rightChild has no children
                        // Set parent to newNode
                        parent.rightChild= newNode;
                        return;
                    }
                }
            }
        }
    }
}
