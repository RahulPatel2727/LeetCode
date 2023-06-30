import java.util.stream.IntStream;

public class Solution {

    private static final int LAND = 0;
    private static final int WATER = 1;
    private static final int[][] ADJACENT_WATER_POINTS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, 1}, {1, 1}, {-1, -1}, {1, -1}};

    private int rows;
    private int columns;
    private int[][] matrix;

    public int latestDayToCross(int rows, int columns, int[][] pointsToFlood) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
        return findMaxDaysToWait(pointsToFlood);
    }

    private int findMaxDaysToWait(int[][] pointsToFlood) {
        UnionFind unionFind = new UnionFind(rows, columns);
        int maxDaysToWait = 0;

        for (int[] point : pointsToFlood) {
            int row = point[0] - 1;
            int column = point[1] - 1;
            matrix[row][column] = WATER;

            for (int[] neighbour : ADJACENT_WATER_POINTS) {
                int nextRow = row + neighbour[0];
                int nextColumn = column + neighbour[1];

                if (isInMatrix(nextRow, nextColumn) && matrix[nextRow][nextColumn] == WATER) {
                    int parentPrevious = unionFind.findParent(row * columns + column);
                    int parentNext = unionFind.findParent(nextRow * columns + nextColumn);
                    unionFind.joinByRank(parentPrevious, parentNext);
                }
            }

            int parentLeftmostSide = unionFind.findParent(unionFind.dammyValueLeftmostSide);
            int parentRightmostSide = unionFind.findParent(unionFind.dammyValueRightmostSide);
            if (parentLeftmostSide == parentRightmostSide) {
                break;
            }
            ++maxDaysToWait;
        }
        return maxDaysToWait;
    }

    private boolean isInMatrix(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
}

class UnionFind {

    int dammyValueLeftmostSide;
    int dammyValueRightmostSide;
    int[] parent;
    int[] rank;

    public UnionFind(int rows, int columns) {
        dammyValueLeftmostSide = rows * columns;
        dammyValueRightmostSide = rows * columns + 1;

        //(rows * columns + 2) to take account of the two dummy values.
        parent = IntStream.range(0, rows * columns + 2).toArray();
        rank = new int[rows * columns + 2];
        joinCornerColumnsToDummyValues(rows, columns);
    }

    private void joinCornerColumnsToDummyValues(int rows, int columns) {
        for (int r = 0; r < rows; ++r) {
            parent[r * columns] = dammyValueLeftmostSide;
            parent[columns * (r + 1) - 1] = dammyValueRightmostSide;
        }
    }

    public int findParent(int index) {
        if (parent[index] != index) {
            parent[index] = findParent(parent[index]);
        }
        return parent[index];
    }

    public void joinByRank(int first, int second) {
        if (rank[first] > rank[second]) {
            parent[second] = first;
        } else if (rank[first] < rank[second]) {
            parent[first] = second;
        } else {
            parent[second] = first;
            ++rank[first];
        }
    }
}