public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j){return 0;}
        int n = m.length;
        int[] queue = new int[n];
        boolean[] visited = new boolean[n];
        int[] distances = new int[n];
        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;
        visited[i] = true;
        distances[i] = 0;
        while (head < tail) {
            int current = queue[head];
            head++;
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (m[current][neighbor] == 1 && !visited[neighbor]) {
                    distances[neighbor] = distances[current] + 1;
                    visited[neighbor] = true;
                    if (neighbor == j) {
                        return distances[neighbor];
                    }
                    queue[tail] = neighbor;
                    tail++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}