import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeDepth {

    // using breadth first search Algorithm to visit each levels of the tree step by step
    public static int MaxDepth(Node root){
        if (root == null)
            return 0;

        int depth = 0;
        Queue<Node> queue =  new LinkedList<>();
        queue.offer(root);

        while (! queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++){
                Node cuurentNode = queue.poll();
                for (Node child: cuurentNode.children) {
                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
//        List<Node> list = new LinkedList<>();
//        list.add(1);
//        list.add(null);
//        list.add(3);
//        list.add(2);
//        list.add(4);
//        list.add(null);
//        list.add(5);
//        list.add(6);
//
//        Node node = new Node(1, list);
//
//        System.out.println(MaxDepth(list));
    }
}

class Node{
    public int val;
    public List<Node> children;

    public Node(){}

    public Node(int _val){
        val = _val;
    }

    public Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    }
}
