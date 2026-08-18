package org.mayouhm.nassab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.nio.file.Path;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FamilyTreeSaveLoad {
    public void save(FamilyTree tree, Path path) throws IOException {
        List<NodeFlat> nodesFlat = new ArrayList<>();

        for (Node node : tree.getAllNodes()) {
            NodeFlat nodeFlat = new NodeFlat();
            nodeFlat.id = node.getId();
            nodeFlat.name = node.getName();
            nodeFlat.father = (node.getFather() != null) ? node.getFather().getId() : null;
            nodeFlat.mother = (node.getMother() != null) ? node.getMother().getId() : null;

            nodesFlat.add(nodeFlat);
        }

        new ObjectMapper().writeValue(path.toFile(), nodesFlat);
    }

    public FamilyTree load(Path path) throws IOException {
        List<NodeFlat> nodesFlat = new ObjectMapper()
            .readValue(path.toFile(), new TypeReference<List<NodeFlat>>() {});
        FamilyTree tree = new FamilyTree();

        for (NodeFlat nodeFlat : nodesFlat) {
            tree.createNode(nodeFlat.id, nodeFlat.name);
        }
        for (NodeFlat nodeFlat : nodesFlat) {
            Node node = tree.getNode(nodeFlat.id);
            if (nodeFlat.father != null) {
                node.setFather(tree.getNode(nodeFlat.father));
            }
            if (nodeFlat.mother != null) {
                node.setMother(tree.getNode(nodeFlat.mother));
            }
        }
        return tree;

    }
}
