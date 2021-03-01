public class BinaryTree {

    static class Node{
        int key;
        Node left, right, parent;

        Node(int key){
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }

    static class BinarySearchTree{
        Node root;

        Node findInorderTraversal(Node inputNode){
            if(inputNode.left == null && inputNode.right == null){
                int newKey = inputNode.key;
                while (inputNode.parent != null){
                    inputNode = inputNode.parent;
                    if(inputNode.key > newKey){
                        return  inputNode;
                    }
                }
            }else{
                if (inputNode.right != null){
                    Node temp = inputNode.right;
                    while (temp.left != null){
                        temp = temp.left;
                    }
                    return temp;
                }
            }
            return null;
        }

        void insert(int key){
            if(this.root == null){
                this.root = new Node(key);
                return;
            }

            Node currentNode = this.root;
            Node newNode = new Node(key);

            while(currentNode != null){
                if(key < currentNode.key){
                    if(currentNode.left == null){
                        currentNode.left = newNode;
                        newNode.parent = currentNode;
                        break;
                    }else{
                        currentNode = currentNode.left;
                    }
                }else{
                    if (currentNode.right == null){
                        currentNode.right = newNode;
                        newNode.parent = currentNode;
                        break;
                    }else{
                        currentNode = currentNode.right;
                    }
                }
            }
        }

        Node getNodeByKey(int key){
            Node currentNode = this.root;

            while (currentNode != null){
                if(key == currentNode.key){
                    return currentNode;
                }

                if(key < currentNode.key){
                    currentNode = currentNode.left;
                }else{
                    currentNode = currentNode.right;
                }
            }

            return  null;
        }
    }

    public static void main(String[] args) {
        Node test, succ;

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(20);
        tree.insert(9);
        tree.insert(25);
        tree.insert(5);
        tree.insert(12);
        tree.insert(11);
        tree.insert(14);

        test = tree.getNodeByKey(20);

        succ = tree.findInorderTraversal(test);

        if(succ != null){
            System.out.printf("Inorder succesor of %d is %d", test.key, succ.key);
        }else{
            System.out.println("Inorder successor doesn't exist");
        }
    }
}
