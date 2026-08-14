package com.hamzamayou;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello world!");
        FamilyTree tree = new FamilyTree();
        // FamilyTreeSaveLoad saveLoad = new FamilyTreeSaveLoad();

        Node ful1 = tree.createNode(1, "fulan");
        Node ful2 = tree.createNode(2, "flan");
        Node ful3 = tree.createNode(3, "filan");
        Node ful4 = tree.createNode(4, "john");
        Node ful5 = tree.createNode(5, "jane");
        
        ful2.setFather(ful1);  
        ful3.setFather(ful2);
        ful4.setFather(ful2);
        ful4.setMother(ful5);

        System.out.println("========ancestry========");
        System.out.println(ful2.getFather().getName());
        System.out.println(ful3.nassab());
        System.out.println(ful3.getLineage());
        System.out.println(ful4.getFather().getName() + " " + ful4.getMother().getName());
        System.out.println(ful3.furthestAncestor().getName());

        System.out.println(); System.out.println("========children========");
        System.out.println(ful2.getChildren());
        System.out.println(ful2.getChildrenStr());

        // saveLoad.save(tree, "saves/test1.json");
    }
}
