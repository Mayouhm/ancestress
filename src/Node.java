import java.util.ArrayList;
import java.util.List;

public class Node {
    int id;
    String name = "Fulan";
    // String gender;
    Node father = null;
    Node mother = null;
    List<Node> children = new ArrayList<>();

    public Node(int pId, String pName) {
        id = pId;
        name = pName;
        // gender = pGender;
    }

    // getters and setters
    public int getId () {
        return this.id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    // public String getGender () {
    //     return Node.gender;
    // }
    // public void setGender (String gender) {
    //     Node.gender = gender;
    // }
    public Node getFather () {
        return this.father;
    }
    public void setFather (Node father) {
        this.father = father;
        this.father.addChild(this);
    }
    public Node getMother () {
        return this.mother;
    }
    public void setMother (Node mother) {
        this.mother = mother;
        this.mother.addChild(this);
    }
    public void removeFather () {
        this.father = null;
    }
    public void removeMother () {
        this.mother = null;
    }
    public List<Node> getChildren () {
        return this.children;
    }
    public void addChild (Node newChild) {
        this.children.add(newChild);
    } 

    // others
    public String nassab () {
        Node current = this;
        String nassab = current.getName();
        while (current.getFather() != null) {
            current = current.getFather();
            nassab = nassab + " b. " +  current.getName();
        }
        return nassab;
    }

    public List<Node> getLineage () {
        Node current = this;
        List<Node> lineage = new ArrayList<>();
        while (current.getFather() != null) {
            current = current.getFather();
            lineage.add(current);
        }
        return lineage;
    }

    public List<String> getChildrenStr() {
        List<String> childrenNames = new ArrayList<>();
        for (Node child : children) {
            childrenNames.add(child.name);
        }
        return childrenNames;
    }
    

    // public String descendants () {
        
    // }
}
