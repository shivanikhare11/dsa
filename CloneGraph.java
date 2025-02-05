package study.GraphGeneral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.neighbors.add(b);
        a.neighbors.add(d);
        b.neighbors.add(a);
        b.neighbors.add(c);
        c.neighbors.add(d);
        c.neighbors.add(b);
        d.neighbors.add(c);
        d.neighbors.add(a);

    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private static Map<Integer, Node> map = new HashMap<>();
    public static Node cloneGraph(Node node) {

        return clone(node);
    }

    public static Node clone(Node node){
        if (node == null) return null;

        if(map.containsKey(node.val)) {
            return map.get(node.val);
        }


        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(newNode.val, newNode);

        for(Node neighbor : node.neighbors){
            newNode.neighbors.add(clone(neighbor));
        }
        return newNode;

    }
}
