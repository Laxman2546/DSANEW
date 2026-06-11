package trees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int maxDepth = 0;
    private static final int MOD = 1000000007;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        maxDepth = 0;
        dfs(1, 0, 0, adj);

        if (maxDepth == 0) return 0;
        return power(2, maxDepth - 1);
    }

    private void dfs(int node, int parent, int depth, List<List<Integer>> adj) {
        maxDepth = Math.max(maxDepth, depth);

        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                dfs(neighbor, node, depth + 1, adj);
            }
        }
    }

    private int power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return (int) res;
    }
}
public class MaximumDepth {
}
