package org.mayouhm.nassab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Hello world!");
        FamilyTree tree = new FamilyTree();
        FamilyTreeSaveLoad saveLoad = new FamilyTreeSaveLoad();

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


        Path projectRoot = findProjectRoot("nassab");
        Path saveDirectory = projectRoot.resolve("saves");
        Files.createDirectories(saveDirectory);


        try {
            saveLoad.save(tree, saveDirectory.resolve("test1.json"));
        } catch (IOException e) {
            System.err.println("Failed to save family tree: " + e.getMessage());
        }

        FamilyTree testLoadTree = new FamilyTree();
        try {
            testLoadTree = saveLoad.load(saveDirectory.resolve("test2.json"));
        } catch (IOException e) {
            System.err.println("Failed to save family tree: " + e.getMessage());
        }

        System.out.println(); System.out.println("========test loading========");
        System.out.println(testLoadTree.getNode(2).getFather().getName());

        Graphics gui = new Graphics();
    }

    public static Path findProjectRoot(String projectName) {
        Path dir = Path.of(System.getProperty("user.dir")).toAbsolutePath();
        while (dir != null ) {
            if (dir.getFileName() != null && dir.getFileName().toString().equals(projectName)) {
                return dir;
            }
            dir = dir.getParent();
        }
        throw new IllegalStateException("Could not find project root: " + projectName);
    }
}
