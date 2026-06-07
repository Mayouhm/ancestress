import java.util.ArrayList;
import java.util.List;

public class Node {
    int id;
    String name = "Fulan";
    String gender;
    Node father = null;
    Node mother = null;

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
    }
    public Node getMother () {
        return this.mother;
    }
    public void setMother (Node mother) {
        this.mother = mother;
    }
    public void removeFather () {
        this.father = null;
    }
    public void removeMother () {
        this.mother = null;
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
    

    // public String descendants () {
        
    // }
}
