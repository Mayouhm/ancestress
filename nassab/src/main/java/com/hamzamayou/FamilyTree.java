package com.hamzamayou;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// import org.w3c.dom.Node;

public class FamilyTree {
    private Map<Integer, Node> nodes = new HashMap<>();
    // public FamilyTree() {
        
    // }
    public Node createNode(int id, String name) {
        Node newNode = new Node(id, name);
        addNode(newNode);
        return newNode;
    }
    public void addNode(Node newNode) {
        nodes.put(newNode.getId(), newNode);
    }

    public Node getNode(int id) {
        return nodes.get(id);
    }

    // public void constructTree(Node main) {
    //     main = main.furthestAncestor();
        
    // }

    public Collection<Node> getAllNodes () {
        return nodes.values();
    }
}
