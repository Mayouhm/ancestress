import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTree {
    private Map<Integer, Node> nodes = new HashMap<>();
    // public FamilyTree() {
        
    // }

    public void addNode(Node newNode) {
        nodes.put(newNode.getId(), newNode);
    }

    public Node getNode(int id) {
        return nodes.get(id);
    }

    public void constructTree(Node main) {
        main = main.furthestAncestor();
        
    }
}
