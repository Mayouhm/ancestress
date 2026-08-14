// package com.hamzamayou;

// import java.util.ArrayList;

// public class FamilyTreeSaveLoad {
//     public void save(FamilyTree tree, String path = "saves/new.json") throws IOException {
//         List<NodeFlat> nodesFlat = new ArrayList<>();

//         for (Node node : tree.getAllNodes()) {
//             NodeFlat nodeFlat = new NodeFlat();
//             nodeFlat.id = node.getId();
//             nodeFlat.name = node.getName();
//             nodeFlat.father = (node.getFather() != null) ? node.getFather().getId() : null;
//             nodeFlat.mother = (node.getMother() != null) ? node.getMother().getId() : null;

//             nodesFlat.add(nodeFlat);
//         }

//         new ObjectMapper().writeValue(new File(path), nodesFlat);

//     }
// }
