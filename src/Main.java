public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Node ful1 = new Node(1, "fulan");
        Node ful2 = new Node(2, "flan");
        Node ful3 = new Node(3, "filan");
        Node ful4 = new Node(4, "john");
        
        ful2.setFather(ful1);  
        ful3.setFather(ful2);
        ful4.setFather(ful2);

        System.out.println("ancestry");
        System.out.println(ful2.getFather().getName());
        System.out.println(ful3.nassab());
        System.out.println(ful3.getLineage());

        System.out.println(); System.out.println("children");
        System.out.println(ful2.getChildren());
        System.out.println(ful2.getChildrenStr());

    }
}