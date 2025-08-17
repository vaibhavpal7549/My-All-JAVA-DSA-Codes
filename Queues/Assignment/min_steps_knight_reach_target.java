

/*
Minimum Steps for a Knight to Reach a Target Position
You are given the position of a Knight on an N x N chessboard and a target position. The task is to determine the minimum number of moves the knight requires to reach the target position.

Constraints:
The knight moves in an "L" shape: (±2, ±1) or (±1, ±2)

The chessboard is 1-indexed.

You must return the minimum steps to reach the target using valid knight moves.
Sample Input:
N = 6
knightPos[] = {4, 5}
targetPos[] = {1, 1}

Sample Output:
3

Time Complexity: O(N^2) in worst case
Space Complexity: O(N^2) due to visited matrix and queue

 */


import java.util.*;

class min_steps_knight_reach_target {
    
    static class Cell {
        int x, y, dist;
        public Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static boolean isInside(int x, int y, int N) {
        return (x >= 1 && x <= N && y >= 1 && y <= N);
    }

    static int minStepToReachTarget(int knightPos[], int targetPos[], int N) {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        boolean[][] visited = new boolean[N + 1][N + 1];
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(knightPos[0], knightPos[1], 0));
        visited[knightPos[0]][knightPos[1]] = true;

        while (!q.isEmpty()) {
            Cell t = q.poll();

            if (t.x == targetPos[0] && t.y == targetPos[1])
                return t.dist;

            for (int i = 0; i < 8; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];

                if (isInside(x, y, N) && !visited[x][y]) {
                    visited[x][y] = true;
                    q.add(new Cell(x, y, t.dist + 1));
                }
            }
        }

        return -1; // in case target is unreachable
    }

    public static void main(String[] args) {
        int N = 6;
        int knightPos[] = {4, 5};
        int targetPos[] = {1, 1};

        System.out.println("Minimum steps: " + minStepToReachTarget(knightPos, targetPos, N));
    }
}

