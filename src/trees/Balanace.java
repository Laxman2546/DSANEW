package trees;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Balanace {
    public static void main(String[] args) {
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
//        int res = createBinaryTree(descriptions);
    }

//    private static int createBinaryTree(int[][] descriptions) {
//        Map<Integer, TreeNode> map = new HashMap<>();
//        // Keeps track of all nodes that are children
//        Set<Integer> children = new HashSet<>();
//
//        for (int[] desc : descriptions) {
//            int parentVal = desc[0];
//            int childVal = desc[1];
//            int isLeft = desc[2];
//
//            // Ensure nodes exist in the map
//            map.putIfAbsent(parentVal, new TreeNode(parentVal));
//            map.putIfAbsent(childVal, new TreeNode(childVal));
//
//            // Link child to parent
//            if (isLeft == 1) {
//                map.get(parentVal).left = map.get(childVal);
//            } else {
//                map.get(parentVal).right = map.get(childVal);
//            }
//
//            // Mark this node as a child
//            children.add(childVal);
//        }
//
//        // The root is the only node that was never a child
//        for (int val : map.keySet()) {
//            if (!children.contains(val)) {
//                return map.get(val);
//            }
//        }
//
//        return null;
//    }
}
