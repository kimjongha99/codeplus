package 개념;

import java.util.*;

public class DFS {
    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static {
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList(5));
        graph.put(4, Collections.emptyList());
        graph.put(5, Arrays.asList(6, 7));
        graph.put(6, Collections.emptyList());
        graph.put(7, Arrays.asList(3));
    }

    public static List<Integer> dfsRecursive(int node, List<Integer> visited) {
        visited.add(node);

        for (int adj : graph.get(node)) {
            if (!visited.contains(adj)) {
                dfsRecursive(adj, visited);
            }
        }

        return visited;
    }

    public static List<Integer> dfsStack(int start) {
        List<Integer> visited = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int top = stack.pop();
            visited.add(top);

            for (int adj : graph.get(top)) {
                if (!visited.contains(adj)) {
                    stack.push(adj);
                }
            }
        }

        return visited;
    }

    public static void main(String[] args) {
        List<Integer> resultRecursive = dfsRecursive(1, new ArrayList<>());
        List<Integer> resultStack = dfsStack(1);

        System.out.println("DFS using recursive approach: " + resultRecursive);
        System.out.println("DFS using stack approach: " + resultStack);

        // Asserting results
        List<Integer> expectedRecursive = Arrays.asList(1, 2, 5, 6, 7, 3, 4);
        List<Integer> expectedStack = Arrays.asList(1, 4, 3, 5, 7, 6, 2);

        if (!resultRecursive.equals(expectedRecursive)) throw new AssertionError();
        if (!resultStack.equals(expectedStack)) throw new AssertionError();
    }
}
