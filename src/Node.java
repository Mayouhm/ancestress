public class Node {

    static String name;
    static Node father;
    static Node mother;

    public Node() {

    }

    public String getName () {
        return Node.name;
    }

    public void setName (String name) {
        Node.name = name;
    }

    public Node getFather () {
        return Node.father;
    }

    public void setFather (Node father) {
        Node.father = father;
    }

    public Node getMother () {
        return Node.mother;
    }

    public void setMother (Node mother) {
        Node.mother = mother;
    }

    public void removeFather () {
        Node.father = null;
    }

    public void removeMother () {
        Node.mother = null;
    }
}
